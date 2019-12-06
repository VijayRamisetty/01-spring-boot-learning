package com.vj.di;

public class BaseBallCoach implements Coach{

	private String team;
	private String emailAddress;
	

	//define a private field for DI
	private FortuneService fortuneService;
	
	
	//define constructor for DI
	public  BaseBallCoach(FortuneService theFortuneService) {
		
		 fortuneService = theFortuneService;
	}
	
	
	
	
	public BaseBallCoach() {
		
	}




	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
}
