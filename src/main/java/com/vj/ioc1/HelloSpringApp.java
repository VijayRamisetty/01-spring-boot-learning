package com.vj.ioc1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		
		//  retreive bean from spring container
		
		Coach theCoach = context.getBean("myCoachB" , Coach.class);
		// call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
}
