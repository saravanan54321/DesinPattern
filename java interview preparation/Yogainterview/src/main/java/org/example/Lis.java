package org.example;

import java.util.Arrays;

public class Lis {

// dynamic programming
    public static int longestIncreasingSubsequence(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        // Create an array to store the length of the LIS ending at each index
        int[] lis = new int[arr.length];
        Arrays.fill(lis, 1); // Each element is its own subsequence initially

        int maxLength = 1;

        // Compute the LIS values

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
            maxLength = Math.max(maxLength, lis[i]);
        }

        return maxLength;
    }
}
