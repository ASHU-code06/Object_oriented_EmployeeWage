import java.util.Scanner;
import java.util.Random;
public class EmployeeWageComputation {

    public static void main(String[] args){
        System.out.println("Enter the number of companies ");
        int noOfCompanies = (new Scanner(System.in)).nextInt();
        /*short cut of
         Scanner noOfCompanies = new Scanner(System.in);
        int arraysize = noOfCompanies.nextInt();*/
        Company companies[]=new Company[noOfCompanies] ; //type -> Company
        for(int i=0;i<noOfCompanies;i++){

            companies[i]=Company.empWageBuilder();

            MainEmp mainEmp = new MainEmp(companies[i].getPartTimeHours(), companies[i].getFullTimeHours());
            int totalMonthlyWage = mainEmp.getMonthlyWageOfEmployee(companies[i].getWagePerHour(),companies[i].getMonthlyWorkingDays());

            System.out.println("the monthly wage of employee of "+companies[i].getCompanyName()+" is "+totalMonthlyWage+"/-  Rs");
            System.out.println("____________________________________________________________________________");
        }

    }
    }


