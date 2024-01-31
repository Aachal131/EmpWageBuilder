package com.lerning;

public class EmpWageBuilder {
    public final String company;
    public final int empRatePerHour;
    public int totalEmpWage;
    public int maxHourPerMonth;
    public int numOfWorkingDays;


    public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Emp Wage For Company: " + company + " is: " + totalEmpWage;
    }
}




