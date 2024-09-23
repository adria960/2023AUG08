package com.example2.demo2.jwt;

import com.google.common.base.Strings;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.crypto.SecretKey;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//This filter will be invoked after every single request - OncePerRequestFilter
public class JwtTokenVerifier extends OncePerRequestFilter {

    private final JwtConfig jwtConfig;
    private final SecretKey secretKey;

    public JwtTokenVerifier(JwtConfig jwtConfig, SecretKey secretKey) {
        this.jwtConfig = jwtConfig;
        this.secretKey = secretKey;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String authorisationHeader = request.getHeader(jwtConfig.getAuthorizationHeader());

        //if authHeader is empty and do not starts with Bearer - the request will be rejected
        if ( Strings.isNullOrEmpty(authorisationHeader) || !authorisationHeader.startsWith(jwtConfig.getTokenPrefix()) ) {
            filterChain.doFilter(request, response);
            return;
        }
        String token = authorisationHeader.replace(jwtConfig.getTokenPrefix(), "");

        try {
             Jws<Claims> claimsJws = Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(token);

            /* From https://github.com/jdubois/generator-jhipster/blob/7b1f2dd8d43097223e5ef209c003e05b1e7579fe/generators/server/templates/src/main/java/package/security/jwt/TokenProvider.java.ejs
             Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(authToken);
                      return true; */

            Claims body = claimsJws.getBody();

            String username = body.getSubject();

            List<Map<String, String>> authorities = (List<Map<String, String>>) body.get("authorities");

            Set<SimpleGrantedAuthority> simpleGrantedAuthorities = authorities.stream()
                    .map(m -> new SimpleGrantedAuthority(m.get("authority")))
                    .collect(Collectors.toSet());

            Authentication authentication = new UsernamePasswordAuthenticationToken(
                    username,
                    null,
                    simpleGrantedAuthorities
            );

            //the authentication
            SecurityContextHolder.getContext().setAuthentication(authentication);
            //the end of token validation or verification -
            //it is register in Security - after ... check it
        } catch (JwtException e) {
            throw new IllegalStateException(String.format("Token %s cannot be trust", token));
        }
        filterChain.doFilter(request, response);
    }
}
