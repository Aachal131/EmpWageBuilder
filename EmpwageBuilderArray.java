package com.lerning;

public class EmpwageBuilderArray{
    public static final int IS_PART_TIME = 1;
    public  static final int IS_FULL_TIME =2;
    private int numOfCompany =0;
    private  EmpWageBuilder[] companyEmpWageArray;
    public  EmpwageBuilderArray(){
        companyEmpWageArray = new EmpWageBuilder[5];

    }
    private void addCompanyEmpWage(String company,int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
        companyEmpWageArray[numOfCompany] = new EmpWageBuilder(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
        numOfCompany++;
    }
    private void  computeEmpWage(){
      for (int i =0;i<numOfCompany; i++){
          companyEmpWageArray[i].setTotalEmpWage((this.computeEmpWage(companyEmpWageArray[i])));
          System.out.println(companyEmpWageArray[i]);
      }
    }
    private  int computeEmpWage(EmpWageBuilder companyEmpWage) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingdays = 0;
        while (totalEmpHrs<=companyEmpWage.maxHourPerMonth && totalWorkingdays <companyEmpWage.numOfWorkingDays) {
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
            System.out.println("Day#:" + totalWorkingdays + "Emp Hr:" + empHrs);
        }
        return  totalEmpHrs * companyEmpWage.empRatePerHour;
    }


    public static void main(String args[]) {
        EmpwageBuilderArray empwageBuilder = new EmpwageBuilderArray();
        empwageBuilder.addCompanyEmpWage("Dmart",20,2,10);
        empwageBuilder.addCompanyEmpWage("Reliance",10,4,20);
        empwageBuilder.computeEmpWage();



    }
}
