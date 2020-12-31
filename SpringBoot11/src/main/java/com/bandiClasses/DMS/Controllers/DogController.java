package com.bandiClasses.DMS.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bandiClasses.DMS.Models.Dog;
import com.bandiClasses.DMS.repository.DogRepository;

@Controller
public class DogController {
	
	ModelAndView mv = new ModelAndView();
	@Autowired
	DogRepository dogRepo;

//	@RequestMapping("dogHome")
//	public String home() {
//		return "home.html";
//	}
	
	@RequestMapping("dogHome")
	public ModelAndView home() {
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("add")
	public ModelAndView add() {
		mv.setViewName("addNewDog.html");
		return mv;
	}
	
	@RequestMapping("addNewDog")
	public ModelAndView addNewDog(Dog dog) {
		dogRepo.save(dog);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("viewModifyDelete")
	public ModelAndView viewDogs() {
		mv.setViewName("viewDogs");
		Iterable<Dog> dogList = dogRepo.findAll();
		mv.addObject("dogs", dogList);
		return mv;
	}
	
	@RequestMapping("editDog")
	public ModelAndView editDog(Dog dog) {
		dogRepo.save(dog);
		mv.setViewName("editDog");
		return mv;
	}
	
	@RequestMapping("deleteDog")
	public ModelAndView deleteDog(Dog dog) {
		//based in id
//		Optional<Dog> dogFound = dogRepo.findById(dog.getId());
//		if(dogFound.isPresent()) {
//			dogRepo.delete(dog);
//		}
//		return home();
		
		//based on the name
		
//		List<Dog> dogsFound = dogRepo.findByName(dog.getName());
//		for(Dog d: dogsFound) {
//			dogRepo.delete(d);
//		}
//		return home();
		
		Dog d = dogRepo.findById(dog.getId()).orElse(new Dog());
		dogRepo.delete(d);
		return home();
	}
}
