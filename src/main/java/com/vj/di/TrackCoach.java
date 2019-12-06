package com.vj.di;

public class TrackCoach implements Coach{

	private String team;
	private String emailAddress;
	
	//define a private field for DI
	private FortuneService fortuneService;
	

	public TrackCoach() {
		
	}
	
			
	//setter Injection
	public void setFortuneService(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		
		return "Run 5K every day";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
		
	}
	
	//add init-method
	
	public void doMyStartupStuff() {
		System.out.println(" doMyStartupStuff......");
		
	}
	
	//add destroy-method
	public void doMyCleanupStuff() {
		System.out.println(" doMyCleanupStuff......");
		
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
