package com.example2.demo2.controller;

import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpRequest;

@Controller
@RequestMapping("/")
public class TemplateController {

    private static final String IP_ADDRESS_REGEX = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";

    @GetMapping("/login")
    public String getLoginView(HttpServletRequest request) {
        System.out.println("\ngetLoginView");
      //  System.out.println("Request getRequestURI: " + request.getRequestURI());
      //  System.out.println("getServletPath: " + request.getServletPath());
       // String domain = getDomain(request.getHeader("X-Forwarded-Host"));
        //System.out.println("Host: " + request.getHeader("Host") + "\n");
        //
     //   getHeaderMap(request);
        System.out.println("------------------------------------------------");
        //
        return "login";
    }

    @GetMapping("/courses")
    public String getCoursesView(HttpServletRequest request) {
       System.out.println("\ngetCoursesView");
       // System.out.println("Request sessionId: " + request.getRequestedSessionId());
        //System.out.println("Request Principal: " + request.getUserPrincipal().toString());
     //   System.out.println("Request getName: " + request.getUserPrincipal().getName());
     //   System.out.println("Request getRequestURI: " + request.getRequestURI());
      //  System.out.println("getServletPath: " + request.getServletPath() + "\n");
        //getHeaderMap(request);
        System.out.println("------------------------------------------------");
        return "courses";
    }

    //programcreek
    private Map<String, String> getHeaderMap(HttpServletRequest request) {
        Map<String, String> headers = new HashMap<String, String>();
        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames != null && headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            Enumeration<String> headerValues = request.getHeaders(key);
            StringBuilder value = new StringBuilder();
            System.out.println(String.format("key: %s", key));

            if (headerValues != null && headerValues.hasMoreElements()) {
                value.append(headerValues.nextElement());

                // If there are multiple values for the header, do comma-separated concat
                // as per RFC 2616:
                // https://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2
                while (headerValues.hasMoreElements()) {
                    value.append(",").append(headerValues.nextElement());
                }
            }
            System.out.println(String.format("value: %s", value) + "\n");
            headers.put(key, value.toString());
        }
        return headers;
    }

    //codota
    public void getHeadersDetails(HttpRequest request) {
        System.out.println("\ngetHeadersDetails");
        HttpHeaders headers = request.getHeaders();
        String origin = headers.getOrigin();
        if ( origin != null ) {
            String scheme;
            String host;
            int port;
            if ( request instanceof ServletServerHttpRequest ) {
                // Build more efficiently if we can: we only need scheme, host, port for origin comparison
                HttpServletRequest servletRequest = ((ServletServerHttpRequest) request).getServletRequest();
                scheme = servletRequest.getScheme();
                host = servletRequest.getServerName();
                port = servletRequest.getServerPort();
                System.out.println("ServletServerHttpRequest");
                System.out.println(String.format("Scheme: %s  host: %s  port: %s", scheme, host, port));
            } else {
                URI uri = request.getURI();
                scheme = uri.getScheme();
                host = uri.getHost();
                port = uri.getPort();
                System.out.println("NOT ServletServerHttpRequest");
                System.out.println(String.format("Scheme: %s  host: %s  port: %s", scheme, host, port));
            }
        }
    }
/*
            UriComponents originUrl = UriComponentsBuilder.fromOriginHeader(origin).build();
            return (ObjectUtils.nullSafeEquals(scheme, originUrl.getScheme()) &&
                    ObjectUtils.nullSafeEquals(host, originUrl.getHost()) &&
                    getPort(scheme, port) == getPort(originUrl.getScheme(), originUrl.getPort()));
        }
/*
    HttpHeaders headers = request.getHeaders();
    String origin = headers.getOrigin();
if (origin == null) {
        return true;
        URI uri = request.getURI();
        scheme = uri.getScheme();
        host = uri.getHost();
        port = uri.getPort();


 */
/*
    private static String getDomain(String hostname) {
        String domain = null;

        if (hostname != null && !hostname.isEmpty()) {
            // The value may include port information, which needs to be removed
           // hostname = stripPort(hostname);

            if (!hostname.matches(IP_ADDRESS_REGEX)) {
                int domainIndex = hostname.indexOf('.');
                if (domainIndex > 0) {
                    domain = hostname.substring(hostname.indexOf('.'));
                }
            }
        }
        return domain;
    }

 */

}
