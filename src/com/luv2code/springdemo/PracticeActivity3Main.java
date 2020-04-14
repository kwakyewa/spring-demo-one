package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//For practice activity 3 testing the custom destroy method for prototype scope
public class PracticeActivity3Main {
	
	public static void main(String[] args) {
	//loading the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-prototypeScope-applicationContext.xml");

		//retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
	
		//call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//closing the context
		context.close();
	}

}
