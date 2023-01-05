package com.bridgelabz;

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
                        int fulltimehours= 8;
                        int dailywage;
                        dailywage = wageperhour *  fulltimehours;
                        System.out.println("daily wage of fulltime working Employee is " + dailywage);
                    }



        }

    }

