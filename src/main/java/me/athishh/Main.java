package me.athishh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to find the nth prime: ");
        int n = scanner.nextInt();

        double sigma1 = 1;
        // first sigma
        for (int i = 1; i <= Math.pow(2, n); i++) {
            double sigma2 = 0;
            // second sigma
            for (int j = 1; j <= i; j++) {
                sigma2 += Math.floor(Math.pow(Math.cos((factorial(j-1)+1)/j * Math.PI), 2));
            }
            sigma1 += Math.floor(Math.pow(n / sigma2, (double) 1 /n));
        }



        System.out.println("The " + n + "th prime is: " + sigma1);
    }


    private static double factorial(int n) {
        double num = 1;
        while (n > 0) {
            num *= n;
            n--;
        }
        return num;
    }


}