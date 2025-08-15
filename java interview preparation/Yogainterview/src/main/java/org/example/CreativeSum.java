package org.example;

import java.util.Scanner;

public class CreativeSum {

    // Function to calculate sum of first M natural numbers
    private static long sumOfFirstN(long M) {
        return (M * (M + 1)) / 2;
    }

    // Function to compute LCM using GCD
    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    // Function to compute GCD (Greatest Common Divisor) using Euclidean Algorithm
    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Main function to calculate required sum
    public static long calcSum(long N, long X, long Y) {
        // Sum of first N natural numbers
        long sumN = sumOfFirstN(N);

        // Sum of multiples of X
        long k = N / X;
        long sumX = X * sumOfFirstN(k);

        // Sum of multiples of Y
        long m = N / Y;
        long sumY = Y * sumOfFirstN(m);

        // Sum of multiples of LCM(X, Y)
        long p = N / lcm(X, Y);
        long sumXY = lcm(X, Y) * sumOfFirstN(p);

        // Apply Inclusion-Exclusion principle
        return sumN - (sumX + sumY - sumXY);
    }

    // Main method to take input and call the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        long N = scanner.nextLong();
        long X = scanner.nextLong();
        long Y = scanner.nextLong();

        // Output result
        System.out.println(calcSum(N, X, Y));

        scanner.close();
    }
}
