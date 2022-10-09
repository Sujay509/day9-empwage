package com.bridgelabz.empWage;

public class Uc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final int partime = 1;
	     final int fulltime = 2;
	     final int wageperhour = 20;
	     int empType = (int) (Math.random() * 100) % 3;
	     int workingHours = 0;
	     if (empType == fulltime)
	     {
	         System.out.println("Employee is Present Full time");
	         workingHours = 8;
	     } else if (empType == partime)
	     {
	         System.out.println("Employee is Present Part time");
	         workingHours = 4;
	     } else
	     {
	         System.out.println("Employee is Absent");
	     }
	     int wage = workingHours * wageperhour;
	     System.out.println("Employee Daily Wage is " + wage);
	
	}

}
