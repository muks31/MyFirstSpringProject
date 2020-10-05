package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		Coach theBCoach = new BaseballCoach();
		Coach theTCoach = new TrackCoach();
		
		//use the object
		System.out.println(theBCoach.getDailyWorkout());
		System.out.println(theTCoach.getDailyWorkout());

	}

}
