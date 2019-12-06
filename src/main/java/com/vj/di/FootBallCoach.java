package com.vj.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("footBallCoach")
public class FootBallCoach implements Coach{

	
	private String team;
	
	@Value("${foo.football.emailAddress}")
	private String emailAddress;
	
	//define a private field for DI
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	

	public FootBallCoach() {
		
	}
	
	/*		
	//setter Injection autowired
	@Autowired
	@Qualifier("happyFortuneService") // qualified needed to specify the bean intended
	public void setFortuneService(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	} */
	
	@Override
	public String getDailyWorkout(){
		
		return "make 3 goals a day";
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
