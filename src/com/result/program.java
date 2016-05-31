/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.result;

import java.util.Scanner;//to take input from user.

/**
 *
 * @author nickhnl
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the Name\t");
            String n = input.nextLine();
            System.out.println("Enter Symbol No.\t");
            String sym = input.nextLine();
            System.out.println("\nMarks in JAVA");
            int J = input.nextInt();
            System.out.println("Marks in PYTHON");
            int P = input.nextInt();
            System.out.println("Marks in NETWORKING");
            int N = input.nextInt();
            System.out.println("Marks in MULTIMEDIA");
            int M = input.nextInt();
            System.out.println("Marks in PHP");
            int Ph = input.nextInt();
            int Total = J + P + N + M + Ph;
            float percentage = Total / 5;
            System.out.println("\t\t MARKSHEET");
            System.out.println("\t____________________________");
            System.out.println("\n\tName:" + n);
            System.out.println("\tSymbol No.:" + sym);
            System.out.println("\n\t --------Your Marks--------");
            System.out.println("\t1.JAVA" + "\t\t\t" + J);
            System.out.println("\t2.PYTHON" + "\t\t" + P);
            System.out.println("\t3.NETWORKING" + "\t\t" + N);
            System.out.println("\t4.MULTIMEDIA" + "\t\t" + M);
            System.out.println("\t5.PHP" + "\t\t\t" + Ph);
            System.out.println("\t____________________________");

            if (J >= 32 && P >= 32 && N >= 32 && M >= 32 && Ph >= 32) {
                System.out.println("\n\t~RESULT:PASS;)");
                System.out.println("\t~TOTAL MARKS:" + Total);
                System.out.println("\t~PERCENTAGE:" + percentage);
                String Division = null;
                if (percentage >= 75) {
                    System.out.println("\t~GRADE:DISTINCTION");
                } else if (percentage >= 65 && percentage < 75) {
                    System.out.println("\t~GRADE:FIRST DIVISION");
                } else if (percentage >= 50 && percentage < 65) {
                    System.out.println("\t~GRADE:SECOND DIVISION");
                } else if (percentage >= 40 && percentage < 50) {
                    System.out.println("\t~GRADE:PASS");
                }
            } else {
                System.out.println("\n\t~YOU FAILED :(");
            }
            System.out.println("\nWanna continue[Y/N]");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }

}
