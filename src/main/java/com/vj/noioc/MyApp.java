package com.vj.noioc;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create the object
		Coach theCoach = new TrackCoach();  // hard-coded object creation
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
