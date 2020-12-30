package com.bandiClasses.SampleWebAppDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DogController {
	
	@RequestMapping("dogHome")
	public String dogHome() {
		return "dogHome.html";
	}
	
	@RequestMapping("dogSchool")
	public String dogSchool() {
		return "dogSchool.html";
	}
	
	@RequestMapping("dogPlay")
	public String dogPlay() {
		return "dogPlay.html";
	}
		
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("dogTreatment")
	public String dogTreatment(){
		return "dogTreatment.jsp";
	}
	
	@RequestMapping("dogFood")
	public String dogFood() {
		return "dogFood.html";
	}

}
