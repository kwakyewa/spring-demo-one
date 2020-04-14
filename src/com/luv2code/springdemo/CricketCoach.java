package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	
	//trying to inject literal values
	//adding new fields for email address and team
	private String emailAddress;
	private String team;
	 
	//create a no-arg constructor-Not really mandatory if thats
	//the only constructor you have in the file
	  public CricketCoach() {
	  System.out.println("CricketCoach: inside no argument constructor"); }
	 
	
	
	//setter method called by spring when they actually inject the dependency
	public void setFortuneService(FortuneService fortuneService) {
	System.out.println("CricketCoach inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	
	//create setter methods for the private fields emailAddress and team
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach inside setter method - setTeam");
		this.team = team;
	}



	@Override
	public String getDailyFortune() {
	
		return "Heyaa: " + fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes" ;
	}

	

}
