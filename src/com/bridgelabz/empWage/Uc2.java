package com.bridgelabz.empWage;

public class Uc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fulltime =1;
		int wageperhour =20;
		int fulldayhour =8;
		int empType = (int) (Math.random() * 100) % 2;
	    int workingHours = 0;
	    if (empType == fulltime)
	    {
	        System.out.println("Employee is Present");
	        workingHours = 8;
	    } else
	    {
	        System.out.println("Employee is Absent");
	    }
	    int wage = workingHours * wageperhour;
	    System.out.println("Employee Daily Wage is " + wage);
	}
}


