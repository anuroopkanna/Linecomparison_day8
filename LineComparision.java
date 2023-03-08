package com.BridgelabzLE;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //line 1
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
        double lengthofline1 =Math.sqrt((x3-x2-x1)^2+(y3-y2-y1)^2);
        System.out.println("Length of the line1 is:" +lengthofline1);
        //line2
        System.out.println("Enter the value of X4: ");
        int x4 =sc.nextInt();
        System.out.println("Enter the value of X5: ");
        int x5 = sc.nextInt();
        System.out.println("Enter the value of X6: ");
        int x6 = sc.nextInt();
        System.out.println("Enter the value of Y4: ");
        int y4 = sc.nextInt();
        System.out.println("Enter the value of Y5: ");
        int y5 = sc.nextInt();
        System.out.println("Enter the value of Y6: ");
        int y6 = sc.nextInt();
        double lengthofline2 =Math.sqrt((x6-x5-x4)^2+(y6-y5-y4)^2);
        System.out.println("Length of the line2 is: "+lengthofline2);
                if(lengthofline1==lengthofline2){
            System.out.println("Both the lines are equal");
        }
                else {
            System.out.println("Lines are not equal");
        }
                if (lengthofline1<lengthofline2){
                    System.out.println("Line 2 is greater than Line1.");
                }
                else {
                    System.out.println("Line1 is greater than Line2.");
                }
    }
}
