import java.util.Scanner;
import java.util.Random;
public class EmployeeWageComputation {
        public static void main(String[] args){

            int wageperhour = 20;
            int fulltimehours = 8;
            int parttimehours = 4;
            int r;
            Random ran = new Random();
            r = ran.nextInt(2);
            System.out.println("random numbers are   " + r);
            if (r == 0) {
                System.out.println("Employee is absent");
            }
            if (r == 1) {
                System.out.println("Employee is present");

                Scanner myinput = new Scanner(System.in);
            System.out.println("Enter 1 for fulltimewage else Enter 2 for partimewage calculation");
            int data = myinput.nextInt();
            switch(data){
                case 1:
                    int dailywage;
                    dailywage = wageperhour * fulltimehours;
                    System.out.println("daily wage of fulltime working Employee is " + dailywage);
                    break;
                case 2:
                    int partimewage;
                    partimewage= wageperhour * parttimehours;
                    System.out.println("Daily wage of partime working Employee is " + partimewage);
                    break;
                default:
                    System.out.println("hi");
                }
            }

        }

}
