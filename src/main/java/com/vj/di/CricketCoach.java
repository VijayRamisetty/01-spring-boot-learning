package com.vj.di;

public class CricketCoach implements Coach{

	private String team;
	private String emailAddress;
	
	//define a private field for DI
	private FortuneService fortuneService;
	

	public CricketCoach() {
		
	}
	
			
	//setter Injection
	public void setFortuneService(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		
		return "Play 5 overs of  bowling";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
		
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	
}
