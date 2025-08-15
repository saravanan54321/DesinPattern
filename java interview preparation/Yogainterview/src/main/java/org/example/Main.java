package org.example;

import static org.example.Lis.longestIncreasingSubsequence;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//        int[] arr1 = {4, 3, 5, 1, 6};
//        System.out.println(longestIncreasingSubsequence(arr1)); // Output: 3
//
//        int[] arr2 = {9, 9, 4, 2};
//        System.out.println(longestIncreasingSubsequence(arr2)); // Output: 1
//
//        }

//        Agecounting ag = new Agecounting();
//        ag.Countage();



        //int[] l1 = {9,9,4,2};//output 1
        //int[] l1 = {4,3,5,1,6};// output 3
        //int[] l1 = {2,3,5,1,6};// output 4
        int[] l1={10,22,9,33,21,50,41,60,22,68,90};//output 7
        Lis2 l2 = new Lis2();
        l2.sub(l1);

    }}
