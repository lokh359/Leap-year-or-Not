# Leap-year-or-Not
to check weather the no is a leap year or no in java programming

![image](https://user-images.githubusercontent.com/58061126/127730630-b93729fd-5cd7-4309-975b-0a5b65e772ac.png)
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
