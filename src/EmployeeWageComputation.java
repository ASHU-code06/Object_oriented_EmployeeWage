import java.util.Scanner;
import java.util.Random;
public class EmployeeWageComputation {

    public static void main(String[] args){

        System.out.println("Welcome");
           Company company = new Company("Zeller",4,8,800,20);

            MainEmp mainEmp = new MainEmp(company.getPartTimeHours(), company.getFullTimeHours());
            int totalMonthlyWage = mainEmp.getMonthlyWageOfEmployee(company.getWagePerHour(),company.getMonthlyWorkingDays());

            System.out.println("the monthly wage of employee of "+company.getCompanyName()+" is "+totalMonthlyWage+"/-  Rs");


        Company company1 = new Company("Bridgelabz",4,8,500,20);

        MainEmp mainEmp1 = new MainEmp(company1.getPartTimeHours(), company1.getFullTimeHours());
        int totalMonthlyWage1 = mainEmp1.getMonthlyWageOfEmployee(company1.getWagePerHour(),company1.getMonthlyWorkingDays());

        System.out.println("the monthly wage of employee of"+company1.getCompanyName()+" is "+totalMonthlyWage1+"/-  Rs");

        Company company2 = new Company("India Glycols",4,8,900,20);

        MainEmp mainEmp2 = new MainEmp(company2.getPartTimeHours(), company2.getFullTimeHours());
        int totalMonthlyWage2 = mainEmp2.getMonthlyWageOfEmployee(company2.getWagePerHour(),company2.getMonthlyWorkingDays());

        System.out.println("the monthly wage of employee of"+company2.getCompanyName()+" is "+totalMonthlyWage2+"/-  Rs");
    }
    }


