package com.luv2code.springdemo;

//For practice activity 2
public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	
	//defining the constructor for dependency injection
	public GolfCoach(FortuneService fortuneService ) {
		this.fortuneService = fortuneService;
		
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practicing my skills for two hours daily";
	}

	@Override
	public String getDailyFortune() {
		//using the fortune service field to help me get a fortune.
		return fortuneService.getFortune();
	}

}
