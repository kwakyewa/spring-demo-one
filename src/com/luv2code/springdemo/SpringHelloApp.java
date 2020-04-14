package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		//accessing the bean using its id
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach2 = context.getBean("myBaseballCoach",Coach.class);
		Coach theCoach3 = context.getBean("myBasketballCoach",Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
	
		System.out.println();
		
		//let's call our method for fortunes
		System.out.println(theCoach2.getDailyFortune());
		System.out.println(theCoach3.getDailyFortune());
		
		//close the context
		context.close();
	}
	
}