/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.marksheet.Mrk;

import java.util.Scanner;

/**
 *
 * @author Karan
 */
public class Marks {

    public void calc() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String ch = in.next();
        System.out.println("Enter symbol number:");
        String x = in.next();

        System.out.println("Enter the marks:");
        String[] sub = {"English", "Physics", "Chemistry", "Math", "Biology"};
        int a[] = new int[sub.length];

        int Total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Marks in " + sub[i] + ":");
            a[i] = in.nextInt();
            Total += a[i];
        }

        int Percentage;
        Percentage = Total / 5;

        String DIVISION;
        if (Percentage >= 80) {
            DIVISION = "Distinction";
        } else if (Percentage >= 60 && Percentage < 80) {
            DIVISION = "First Division";
        } else if (Percentage < 60 && Percentage >= 50) {
            DIVISION = "Second Division";

        } else if (Percentage >= 40 && Percentage < 50) {
            DIVISION = "Third Division";
        } else {
            DIVISION = "*";
        }
        System.out.println("Name\t" + ch);
        System.out.println("Symbol no." + x);
        System.out.println("Marksheet");
        for (int i = 0; i < sub.length; i++) {
            System.out.println(sub[i] + "......."+ a[i]);
        }
        /*
         System.out.println("sub[0]                :"+a[0]);
         System.out.println("sub[1]                :"+a[1]);
         System.out.println("sub[2]                :"+a[2]);
         System.out.println("sub[3]                :"+a[3]);
         System.out.println("sub[4]                :"+a[4]);
         System.out.println(".................................");
         */
        if (a[0] < 32 || a[1] < 32 || a[2] < 32 || a[3] < 32 || a[4] < 32) {
            System.out.println("Total=");
            System.out.println("Percentage=");
            System.out.println("DIVISION=");
            System.out.println("Fail");
        } else {
            System.out.println("Total=" + Total);
            System.out.println("Percentage=" + Percentage);
            System.out.println("DIVISION=" + DIVISION);
            System.out.println("Pass");
        }

    }

}
