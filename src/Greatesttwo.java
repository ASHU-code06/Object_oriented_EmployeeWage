import java.util.Scanner;

public class Greatesttwo {
    public static void main(String[] args){
        System.out.println("Enter first number");
        Scanner myinput = new Scanner(System.in);
        int a = myinput.nextInt();
        System.out.println("Enter second  number");
        int b = myinput.nextInt();
        System.out.println("Enter third number");
        int c = myinput.nextInt();

        Greatesttwo obj =new Greatesttwo();
        obj.isgreatest(a,b,c);

    }
    public void isgreatest(int a,int b, int c){
        if (a<b&a<c){
            System.out.println("Numbers are "+b+" and "+c);
        } else if (b<a&b<c) {
            System.out.println("Numbers are "+a+" and "+c);
        }else {
            System.out.println("Numbers are "+a+" and "+b);
        }
    }

}
