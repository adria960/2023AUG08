package io.javabrains.springsecurityjwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiResource {

    @RequestMapping({"/hello"})
    public String hello() {
        System.out.println("********************************************************************");
        return "Hello world!";
    }
}
