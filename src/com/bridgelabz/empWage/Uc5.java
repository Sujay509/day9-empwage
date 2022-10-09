package com.bridgelabz.empWage;

public class Uc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int partime = 1;
	    final int fulltime = 2;
	    final int wageperhour = 20;
	    final int workingdays = 20;

	    int totalWage = 0;
	    for (int day = 1; day <= workingdays; day++)
	    {
	        int empType = (int) (Math.random() * 100) % 3;
	        int workingHours =0;
	        switch (empType)
	        {
	            case fulltime:
	                workingHours = 8;
	                break;
	            case partime:
	                workingHours = 4;
	                break;
	            default:
	        }
	        int wage = workingHours * wageperhour;
	        System.out.println("Day " + day + " wage is :" + " " + wage);
	        		
	        totalWage += wage;
	    }
	    System.out.println("Total wage for a month is " + totalWage);   
	}

}
