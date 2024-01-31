package com.lerning;

public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private  final String company;
    private  final int empRatePerHour;
    private  final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    public  EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays,int maxHoursPerMonth){
        this.company =company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void computeEmpWage(){
        int empHrs = 0,totalEmpHrs= 0,totalWorkingdays =0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingdays <numOfWorkingDays){
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
        totalEmpWage = totalEmpHrs *empRatePerHour;
    }
    @Override
    public  String toString(){
        return  "Total Emp Wage For Company: " +company+ " is: " + totalEmpWage;
    }

    public static void main(String args[]) {
        EmpWageBuilder dMart = new EmpWageBuilder("Dmart",20,2,10);
        EmpWageBuilder reliance = new EmpWageBuilder("Reliance",10,4,20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);


    }
}


