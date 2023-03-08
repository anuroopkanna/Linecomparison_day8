package com.BridgelabzLE;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Line Comparison Program. ");
        System.out.println("Enter the value of X1: ");
        int x1 =sc.nextInt();
        System.out.println("Enter the value of X2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of X3: ");
        int x3 = sc.nextInt();
        System.out.println("Enter the value of Y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of Y2: ");
        int y2 = sc.nextInt();
        System.out.println("Enter the value of Y3: ");
        int y3 = sc.nextInt();
        double length =Math.sqrt((x3-x2-x1)^2+(y3-y2-y1)^2);
        System.out.println("Length of the line is: "+"("+x1+","+y1+"),"+"("+x2+","+y2+"),"+"("+x3+","+y3+")==>"+length);
    }
}
