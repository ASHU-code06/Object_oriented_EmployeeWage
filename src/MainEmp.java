import java.util.Random;

public class MainEmp {
    public static void monthlywageofemployee() {
        int monthlyhours = 0;
        int check;
        int totalworkinghours = 0;
        int add = 0;
        System.out.println("Monthly attendence of employee");
        while (monthlyhours < 100) {
            Random r = new Random();
            check = r.nextInt(3);
            if (check == 0) {
                System.out.println("Employee is absent");
            } else if (check == 1) {
                System.out.println("Employee is working fulltime = 8 hrs ");
                totalworkinghours = 8;
                add = add + totalworkinghours;
            } else if (check == 2) {
                System.out.println("Employee is working parttime = 4 hrs ");
                totalworkinghours = 4;
                add = add + totalworkinghours;
            }

            monthlyhours++;
            System.out.println(" total hours the employee work is  " + add + "hrs");
        }
        MainEmp obj = new MainEmp();
        obj.calculation("BRIDGELABZ",100,add);
        obj.calculation("INDIAN GLYCOLS ",30,add);
        obj.calculation("YARA FERTILIZERS",90,add);
        obj.calculation("MAHINDRA",63,add);
        obj.calculation("TYSON",80,add);
        obj.calculation("LG",40,add);
        obj.calculation("TATA",70,add);


    }

    public void calculation(String comp, int wageperhour, int monthlyworkinghours) {
        int monthlywageofEmployee = wageperhour*monthlyworkinghours;
        System.out.println("\n");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM FOR "+comp+" COMPANY");
        System.out.println("The wageperhour of company is "+wageperhour+"/-  Rs");
        System.out.println("Maximum working hrs in company for employee is 100hrs");
        System.out.println("Total working hrs of employee is "+monthlyworkinghours+" hrs");
        System.out.println("Monthly wage is "+monthlywageofEmployee+"/-  Rs");

    }
}

