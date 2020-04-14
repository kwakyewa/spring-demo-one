//For practice activity 2
package com.luv2code.springdemo;

import java.util.Random;


public class GreatFortuneService implements FortuneService {
	

	
	//Creating an array of fortunes 
	String myArray[] = {"You could win a new car today", 
			"$100,000 spending money",
			"you get to see your dream man today"};
	
	
	//Create the random number generator object
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(myArray.length); //myArray.length is the upperbound of the numbers to be generated. In this case from 0 to 2 inclusive
		
		String myFortune = myArray[index];
		return myFortune;
	}

}
