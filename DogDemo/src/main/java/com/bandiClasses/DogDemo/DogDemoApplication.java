package com.bandiClasses.DogDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DogDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(DogDemoApplication.class, args);
		System.out.println("Hello, Spring Boot!");
		System.out.println("Goog Bye, Corona!");
		
		Dog d1 = appContext.getBean(Dog.class);
		Trainer t1 = appContext.getBean(Trainer.class);
		t1.setId(23);
		t1.setName("John");
		
		System.out.println(d1);
		d1.setId(12);
		d1.setName("Puppy");
		d1.setBreed("Pug");
		d1.setTrainer(t1);
		System.out.println(d1);
		
		Dog d2 = appContext.getBean(Dog.class);
		System.out.println(d2);
		d2.setId(121);
		d2.setName("Puppy1");
		d2.setBreed("Pug1");
		d2.setTrainer(t1);
		System.out.println(d2);
		System.out.println(d1);
	}

}
