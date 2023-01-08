import java.util.Random;

public class MainEmp {
    private int partTimeHrs;
    private int fullTimeHrs;
    public MainEmp(int _partTimeHrs,int _fullTimeHrs) {
        this.partTimeHrs=_partTimeHrs;
        this.fullTimeHrs=_fullTimeHrs;
    }

    public int getMonthlyWageOfEmployee(int wagePerHour,int monthlyWorkingDays) {

        boolean isFullTime = isEmployeeFullTime();
        int workingHours = isFullTime?fullTimeHrs:partTimeHrs;
        int totalHours = 0;

        for (int i =0;i<monthlyWorkingDays;i++){
            boolean isEmployeePresent = isEmployeePresent();
           totalHours=totalHours+(isEmployeePresent?workingHours:0);

        }

        int totalMonthlyWages = totalHours*wagePerHour;
        return totalMonthlyWages;

    }
    private boolean isEmployeePresent(){
        int check;
        Random r = new Random();
        check = r.nextInt(2);
        if (check == 0) {
            System.out.println("Employee is absent");
            return false;
        } else  {
            System.out.println("Employee is present");
            return true;
        }
        /*can do like this too ; return check==0?false:true;
         if condition :- 1 = present & 0 = absent */
    }
    private boolean isEmployeeFullTime(){
        int check;
        Random r = new Random();
        check = r.nextInt(2);
        if (check == 0) {
            System.out.println("Employee is parttime");
            return false;
        } else  {
            System.out.println("Employee is fulltime");
            return true;
        }

    }

}

