package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		//load the spring configuration file 
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		
		//checking for singleton by checking if they are equal for the two reference variables theCoach and alphaCoach
		boolean result = theCoach == alphaCoach;
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		//close the context
		context.close();
		
		
		
		//calling the methods 
		System.out.println(theCoach.getDailyFortune());
		System.out.println(alphaCoach.getDailyFortune());
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyWorkout());
		
	}

}
