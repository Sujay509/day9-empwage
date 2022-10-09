package com.bridgelabz.empWage;

public class Uc8 {

	 public static void  computeEmpolyeeWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
	    {
	        final int partime = 1;
	        final int fulltime = 2;
	        int totalWage = 0;
	        int workingHrs = 0;

	        System.out.println( companyName + " employee :- ");
	        
	        System.out.println("");
	      
	        System.out.println("Maximum working days:" + maxWorkingDays);
	        System.out.println("Maximum working hours:" + maxWorkingHrs);
	        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

	        for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays
	                && totalWorkingHrs <= maxWorkingHrs; day++, totalWorkingHrs += workingHrs)
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
	            
				int wage = workingHrs * wagePerHr;
	            totalWage += wage;
	            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
	        }
	        System.out.println("Total wage for a month of " + companyName + " employee is " + totalWage + "\n");
	    }
	    public static void main(String args[])
	    {
	    	 computeEmpolyeeWage("Amazon", 40, 15, 200);
	    	 computeEmpolyeeWage("Flipkart", 20, 20, 100);
	    }
	}

