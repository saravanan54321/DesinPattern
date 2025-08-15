package org.example;

import java.util.Scanner;

public class StringCompressor {

    

    public static String compressString(String input) {

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(input.charAt(i - 1))) {
                count++;
            } else {
                compressed.append(count).append(Character.toLowerCase(input.charAt(i - 1)));
                count = 1;
            }
        }

        // Append last character and its count
        compressed.append(count).append(Character.toLowerCase(input.charAt(input.length() - 1)));

        return compressed.toString();
    }


    public static void main(String[] args) {

       String input ="aabbcc";

        String result = compressString(input);
        System.out.println("Compressed output: " + result);
    }
}

