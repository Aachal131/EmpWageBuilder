package com.lerning;

public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;
    public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays,int maxHoursPerMonth){
        int empHrs = 0;
        int totalEmpHrs= 0;
        int totalWorkingdays =0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingdays <NUM_OF_WORKING_DAYS){
            totalWorkingdays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#:"+ totalWorkingdays +"Emp Hr:" +empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp  For Company:"+company+" is: "+totalEmpWage);
        return  totalEmpWage;
    }

    public static void main(String args[]) {
        computeEmpWage("DMart",20,2,10);
        computeEmpWage("Reliance",10,4,20);


    }
}


