package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//For practice activity 2
public class PracticeActivity2Main {
	
	public static void main(String[] args) {
	//loading the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
	//retrieving bin from spring container
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		
		//calling the methods on the myGolfBean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//closing the context
		context.close();
	}

}
