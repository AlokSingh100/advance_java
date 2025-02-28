package com.mvc;

import org.springframework.stereotype.Controller;

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
	
}
