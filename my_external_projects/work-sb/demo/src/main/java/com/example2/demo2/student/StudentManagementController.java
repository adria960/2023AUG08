package com.example2.demo2.student;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
@RequestMapping("/management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2,"Maria Jones"),
            new Student(3, "Anna Smith")
    );

    // hasRole('ROLE_)   hasAnyRole('ROLE_)   hasAuthority('permission') hasAnyAuthority('permission')

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMINTRAINEE')")
    public List<Student> getAllStudents(HttpServletRequest request) {
        System.out.println("\ngetAllStudents");
       // System.out.println("Request   URI:" + request.getRequestURI() + " \ngetServletPath: " + request.getServletPath()
      //          + " \nRemoteUser: " + request.getRemoteUser());
       // getHeaderMap(request);
        return STUDENTS;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('student:write')")
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println("\nregisterNewStudent");
        System.out.println(student);
    }

    @DeleteMapping(path="{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void deleteStudent(@PathVariable("studentId") Integer studentId) {
        System.out.println("\neleteStudent");
        System.out.println(studentId);
    }

    @PutMapping(path="{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void updateStudent(@PathVariable("studentId") Integer studentId, @RequestBody Student student) {
        System.out.println("\nupdateStudent");
        System.out.println(String.format("%s %s", studentId, student));
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
}
