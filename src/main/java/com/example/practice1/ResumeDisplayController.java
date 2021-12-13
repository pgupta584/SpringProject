<<<<<<< HEAD
=======
<<<<<<<< HEAD:src/main/java/com/example/practice1/ResumeDisplayController.java
>>>>>>> 3174df623b76f3e6be593e34217727a0a23c877a
package com.example.practice1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResumeDisplayController
{
    @ModelAttribute
    public void modelData(Model m)
    {
        m.addAttribute("Name", "Pankaj");
    }

    @RequestMapping("/displayresume")
    public String home()
    {
        System.out.print("Welcome to home page");
<<<<<<< HEAD
        //return "index.jsp";//Just we have to return the jsp page & return type should be String bcz application.prop .jsp prefix added
        return "displayresume";
    }
}
=======
        //return "index";//Just we have to return the jsp page & return type should be String bcz application.prop .jsp prefix added
        return "displayresume";
    }
}
========
//package com.example.practice1.mailSenderService.model;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class ResumeDisplayController
//{
//    @ModelAttribute
//    public void modelData(Model m)
//    {
//        m.addAttribute("Name", "Pankaj");
//    }
//
//    @RequestMapping("/displayresume")
//    public String home()
//    {
//        System.out.print("Welcome to home page");
//        //return "index.jsp";//Just we have to return the jsp page & return type should be String
//        return "displayresume";
//    }
//}
>>>>>>>> 3174df623b76f3e6be593e34217727a0a23c877a:src/main/java/com/example/practice1/mailSenderService/model/ResumeDisplayController.java
>>>>>>> 3174df623b76f3e6be593e34217727a0a23c877a
