package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int iter = 1;
        Scanner scanner = new Scanner(System.in);


        while (iter != 11) {

            System.out.println("Enter number #" + iter + ":");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid Number");

            } else {

                int number = scanner.nextInt();
                sum += number;
                iter++;
            }
            scanner.nextLine();

        }

        scanner.close();
        System.out.println("Total sum = " + sum);




    }
}
