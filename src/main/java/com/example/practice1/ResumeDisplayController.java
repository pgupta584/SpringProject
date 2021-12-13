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
        //return "index.jsp";//Just we have to return the jsp page & return type should be String bcz application.prop .jsp prefix added
        return "displayresume";
    }
}
