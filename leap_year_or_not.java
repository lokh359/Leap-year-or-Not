package com.company;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year ");
        int year=sc.nextInt();
        System.out.println("****************************************");
        if(year %4==0 && year%100 !=0)
        {
            System.out.println("Leap Year "+year);
        }
        else if(year %400==0)
        {
            System.out.println("Its a Leap Year"+year);
        }
        else
        {
            System.out.println("Its not a leap year"+year);
        }
        System.out.println("********************************************");
    }
}
