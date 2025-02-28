package com.mvc;

import java.net.http.HttpClient;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
@RequestMapping("/home")
public String show() 
{
	System.out.println("in show mathod");
	return "ind";
}
@RequestMapping("/about")
public String aboutpage(){
System.out.println("in about");
return "about";
}

@RequestMapping("/login")
public String login(HttpServletRequest req,Model m) {
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	if (password.equals("pass")) {
		String msg="hallo"+username+"testing modle";
		m.addAttribute("msg",msg);
		return "login";
		
	}
	else {
		String msg= "hallo"+username+"wrong pass";
		m.addAttribute("msg",msg);
		return "error";
	}

	

	
}
	
}
