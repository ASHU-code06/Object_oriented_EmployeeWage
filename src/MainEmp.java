public class MainEmp {
    public static void monthlywageofemployee(){
        int wageperhour = 20;
        int fulltimehours = 8;
        int parttimehours = 4;
        int wageperday= wageperhour * fulltimehours;
        int wageperdayp = wageperhour * parttimehours;
        System.out.println("daily wage of fulltime working Employee is " +wageperday);
        int monthlyworkingdays = 20 ;
        int monthlywage;
        monthlywage= monthlyworkingdays * wageperday;
        System.out.print("monthlywage of Employee is  " + monthlywage );
        System.out.print("/-  rupees");
          /*suppose employee worked
                 16 days fulltime
                 and 4 days parttime
                 in a month of 20 working days
                 monthlywage= 16 * wageperday + 4 * wageperdayp
                 */

    }
}

