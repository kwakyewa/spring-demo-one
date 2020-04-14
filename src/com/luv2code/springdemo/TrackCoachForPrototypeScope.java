package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

//the prototype scoped bean / client code implements the DisposableBean interface which has a destroy method

public class TrackCoachForPrototypeScope  implements Coach, DisposableBean {
	
	private FortuneService fortuneService;
	
	
	public TrackCoachForPrototypeScope(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	
	//add an init method
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff");	
	}

	
	//method from the DisposableBean class
	@Override
	public void destroy() throws Exception {
	System.out.println("TrackCoach inside method doMyCleanUpStuffhere");
		
	}

}
