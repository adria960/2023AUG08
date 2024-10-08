package io.javabrains.springsecurityjwt;

import io.javabrains.springsecurityjwt.models.AuthenticationRequest;
import io.javabrains.springsecurityjwt.models.AuthenticationResponse;
import io.javabrains.springsecurityjwt.service.MyUserDetailsService;
import io.javabrains.springsecurityjwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class HelloResource {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;
/*
   @RequestMapping({"/hello"})
    public String hello() {
       return "Hello world!";
   }

 */

   @RequestMapping(value="/authenticate", method=RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
       try {
           authenticationManager.authenticate(
                   new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
                   );
       } catch(BadCredentialsException e) {
           throw new Exception("Incorrect usename or password", e);
       }
       final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
       final String jwt = jwtTokenUtil.generateToken(userDetails);

       return(ResponseEntity.ok((new AuthenticationResponse(jwt))));

   }
}
