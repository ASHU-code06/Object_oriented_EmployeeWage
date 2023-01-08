import java.util.Scanner;
import java.util.Random;
public class EmployeeWageComputation {

    public static void main(String[] args){

        System.out.println("Welcome");

            MainEmp obj = new MainEmp(4,8);
            int totalMonthlyWage = obj.getMonthlyWageOfEmployee(20,20);
            System.out.println("the monthly wage of employee is "+totalMonthlyWage+"/-  Rs");
        }
    }


