package com.bridgelabz;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year=scanner.nextInt();
        if((year%400==0) || (year%4==0 && year%100!=0)) {
            System.out.println("It is leap year");
        }
        else {
            System.out.println("It is not leap year");
        }
    }
}
