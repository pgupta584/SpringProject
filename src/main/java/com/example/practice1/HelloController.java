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
<<<<<<< HEAD
        return "Hello World -Pankaj Gupta";// + appName;
=======
        return "Hello World - Pankaj Gupta";// + appName;
>>>>>>> 3174df623b76f3e6be593e34217727a0a23c877a
        //return "displayresume.jsp";
    }
}
