package com.example.practice1.mailSenderService.homecontroller;

import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//@RestController
@Controller
public class HomeController
{
    @RequestMapping("/home")
    public String home()
    {
    	System.out.print("Welcome to home page");
        //return "index.jsp";//Just we have to return the jsp page & return type should be String
        return "index";
    }
    /*@RequestMapping("/add")
    public String add(HttpServletRequest request)
    {
        //Using HttpServletRequest we can parameterised the value
        int i= Integer.parseInt(request.getParameter("num1"));
        int j= Integer.parseInt(request.getParameter("num2"));
        
        int num3=i+j;
        
        //Now to pass this in result.jsp file, we need to create the session and set the attribute
        HttpSession session= request.getSession();
        session.setAttribute("num3",num3);// Also change in result.jsp


        return "result.jsp";
    }
   */
    /*@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int i ,@RequestParam("num2") int j)
	{
		ModelAndView mv = new ModelAndView();
		//mv.setViewName("result.jsp");
		mv.setViewName("result");
		int num3 = i + j;
		
		mv.addObject("num3",num3);
		
		return  mv;		
	}
	*/
    @RequestMapping("add")
	public String add(@RequestParam("num1")int i ,@RequestParam("num2") int j, Model m)
	{
		int num3 = i + j;	
		m.addAttribute("num3",num3);// Instead of modelAndView we can also use Model & ModelMap & use their reff to call it's methods		
		return  "result";	
	}
    
}
