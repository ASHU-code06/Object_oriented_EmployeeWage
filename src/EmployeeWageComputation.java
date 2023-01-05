import java.util.Random;
public class EmployeeWageComputation {
        public static void main(String[] args){

                    int r;
                    Random ran = new Random();
                    r = ran.nextInt(2);
                    System.out.println("random numbers are   " + r);
                    if (r == 0) {
                        System.out.println("Employee is absent");
                    }
                    if (r == 1) {
                        System.out.println("Employee is present");

                        int wageperhour = 20;
                        int parttimehours = 4;
                        int partimewage;
                        partimewage = wageperhour * parttimehours ;
                        System.out.println("Daily wage of partime working Employee is " + partimewage);
                    }


        }

}
