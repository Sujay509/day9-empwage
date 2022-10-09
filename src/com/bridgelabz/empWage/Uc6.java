package com.bridgelabz.empWage;

public class Uc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int partime = 1;
	    final int fulltime = 2;
	    final int wageperhour = 20;
	    final int maxworkingdays = 20;
	    final int maxworkinghrs = 100;

	    int totalWage = 0;
	    int workingHrs = 0;
	    System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
	    for (int day = 1, totalWorkingHrs = 0; day <= maxworkingdays
	            && totalWorkingHrs < maxworkinghrs; day++, totalWorkingHrs += workingHrs)
	    {

	        int empType = (int) (Math.random() * 100) % 3;
	        switch (empType)
	        {
	        case fulltime:
	            workingHrs = 8;
	            break;
	        case partime:
	            workingHrs = 4;
	            break;
	        default:
	            workingHrs = 0;
	            break;
	        }
	        int wage = workingHrs * wageperhour;
	        totalWage += wage;
	        System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);

	    }
	    System.out.println("Total wage for a month is " + totalWage);
	}

}
