package com.example.practice1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //@Value("${app.name}")
    //private String appName;
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello World - Pankaj Gupta";// + appName;
        //return "displayresume.jsp";
    }
}
