package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class XmlComponentScanApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello hello= context.getBean(Hello.class);
		hello.setMsg("i love you");
		System.out.println(hello.getMsg());
		
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("siri");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}

}
