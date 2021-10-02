package com.example.practice1.mailSenderService.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class ResumeController
{
    @ModelAttribute
    public void modelData(Model m)
    {
        m.addAttribute("Name", "Pankaj");
    }

    @RequestMapping("/resume")
    public String home()
    {
        System.out.print("Welcome to home page");
        //return "index.jsp";//Just we have to return the jsp page & return type should be String
        return "addResume";
    }

    @PostMapping(value="addResume")
    public String add(@ModelAttribute AddEmployee e)
    {
        return  "viewResume";
    }

    @GetMapping("getResume")
    public String getEmployee(Model m)
    {
        //We want to return list of resume so will use list
        List<AddResume> resume= Arrays.asList(
                new AddResume("Pankaj","B.Tech",8,"Null"),
                new AddResume("Navin","B.Tech",4,"Null"));
        //return employee.toString(); //to convert obj into String
        m.addAttribute("result", resume);
        return "viewResumeList";// Now we need to create a jsp for results
    }
}
