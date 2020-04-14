package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	
	//Define private field for fortuneService
	private FortuneService fortuneService;
	
	
	public BaseballCoach() {
		
	}
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return  "Spend 30 minutes on batting practice"; 
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
