package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter method of email Address");
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		System.out.println("Inside setter method of team");
		this.team = team;
	}

	//no-arg constructor
	public CricketCoach() {System.out.println("Inside no-arg Constructor");}
	
	/**
	 * @param fortuneService the fortuneService to set
	 */
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method of fortune service");
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyWorkout() {

		return "Practice WicketKeeping for half an hour";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
