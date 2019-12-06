package com.vj.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

		
		System.out.println("------- constructor Injection ----");
		//  retrieve bean from spring container

		
		Coach theCoach = context.getBean("myCoachB.DI" , Coach.class);
		// call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call new methods
		System.out.println(theCoach.getDailyFortune());
		
		
		System.out.println("\n------- setter Injection ----");
		

		CricketCoach theCoach2 = context.getBean("myCoachC.DI" , CricketCoach.class);
		// call methods on the bean
		
		System.out.println(theCoach2.getDailyWorkout());
		
		//call new methods
		System.out.println(theCoach2.getDailyFortune());
		
		System.out.println("\n------- string literals ----");
		
		//string literals
		System.out.println(theCoach2.getTeam());
		
		
		//properties file value
		System.out.println("\n------- properies file  ----");
		System.out.println(theCoach2.getEmailAddress());
		
		
		System.out.println("------- Bean Scope ----");
		//  retrieve bean from spring container

		
		Coach theCoachAlpha = context.getBean("myCoachB.BS" , Coach.class);
		Coach theCoachBeta = context.getBean("myCoachB.BS" , Coach.class);
	
		System.out.println("Singleton");
		System.out.println(theCoachAlpha==theCoachBeta ? true : false);
		
		Coach theCoach5 = context.getBean("myCoachC.BS" , Coach.class);
		Coach theCoach6 = context.getBean("myCoachC.BS" , Coach.class);
	
		System.out.println("Prototype");
		System.out.println(theCoach5==theCoach6 ? true : false);
		
		
		System.out.println("\n------ BeanLifeCycle --- init and destroy example---");
		
		Coach newCoach = context.getBean("myCoachT.BeanLifeCycle", Coach.class);
		
		System.out.println(newCoach.getDailyWorkout());
		
		
		System.out.println("\n------ Annotation example ---");
		
		FootBallCoach annoCoach = context.getBean("footBallCoach",FootBallCoach.class);
		
		System.out.println(annoCoach.getDailyWorkout());
		System.out.println(annoCoach.getDailyFortune());  // auto-wired fortune object 
		System.out.println(annoCoach.getEmailAddress());  // auto-wired email from props file  
		
		
		// close the context
		context.close();
	}
}
