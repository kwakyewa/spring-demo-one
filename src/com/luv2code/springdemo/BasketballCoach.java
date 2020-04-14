package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
	
	//Define the private field for the fortune service
	private FortuneService fortuneService;
	
	
	//define the constructor for the dependency injection
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Run back and forth the basketball pitch 50 times";
	}
	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it: " + fortuneService.getFortune();
	}

}
