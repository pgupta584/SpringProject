package com.example.practice1.mailSenderService.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController 
{
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name", "Pankaj");
	}
	
	@RequestMapping("/ehome")
    public String home()
    {
    	System.out.print("Welcome to home page");
        //return "index.jsp";//Just we have to return the jsp page & return type should be String
        return "addEmployee";
    }
	
	 /*@RequestMapping("addEmployee")
		public String add(@RequestParam("eid")int eid ,@RequestParam("ename") String ename, Model m)
		{
			AddEmployee e=new AddEmployee();
			e.setEid(eid);
			e.setEname(ename);
			m.addAttribute(e);// Instead of modelAndView we can also use Model & ModelMap & use their reff to call it's methods		
			return  "viewEmployee";	
		}*/
	 /*@RequestMapping("addEmployee")
		public String add(@ModelAttribute AddEmployee e, Model m)
		{
			m.addAttribute(e);// Instead of modelAndView we can also use Model & ModelMap & use their reff to call it's methods		
			return  "viewEmployee";	
		}
		*/
	/*@RequestMapping("addEmployee")
	public String add(@ModelAttribute AddEmployee e)
	{
		return  "viewEmployee";	
	}
	*/
	/*@RequestMapping(value="addEmployee", method=RequestMethod.POST)
	public String add(@ModelAttribute AddEmployee e)
	{
		return  "viewEmployee";	
	}
	*/
	/*
	@PostMapping(value="addEmployee")
	public String add(@ModelAttribute AddEmployee e)
	{
		return  "viewEmployee";	
	}
	
	@GetMapping("getEmployee")
	public String getEmployee(Model m)
	{
		//We want to return list of employee so will use list
		List<AddEmployee> employee= Arrays.asList(new AddEmployee(101,"Pankaj"),new AddEmployee(102,"Navin"));	
		//return employee.toString(); //to convert obj into String
		m.addAttribute("result", employee);
		return "viewEmployeeList";// Now we need to create a jsp for results	
	}

	 */
	
}
