package com.bvan.javaoop.sample.exception.unchecked.factorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class FactorialInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Illegal input, not an integer");
            return;
        }

        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Illegal factorial arg");
            return;
        }

        BigInteger factorial = Factorial.factorial(n);
        System.out.println(n + "! = " + factorial);
    }
}
