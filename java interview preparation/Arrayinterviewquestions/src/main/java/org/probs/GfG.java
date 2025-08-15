package org.probs;

// subset of array
//class GfG {
//
//    static boolean isSubset(int[] a, int[] b) {
//        // Iterate over each element in the second array
//        int m = a.length;
//        int n = b.length;
//        for (int i = 0; i < n; i++) {
//            boolean found = false;
//            // Check if the element exists in the first array
//            for (int j = 0; j < m; j++) {
//                if (b[i] == a[j]) {
//                    found = true;
//                    //this break is for inner loop
//                    break;
//                }
//            }
//            // If any element is not found, return false
//            // this is for outer loop
//            if (!found) return false;
//        }
//        // If all elements are found, return true
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int[] a = {10, 5, 2, 23, 19};
//        int[] b = {19, 5, 3};
//
//        if (isSubset(a, b)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }
//}


import java.util.Arrays;

class GfG {
    static boolean isSubset(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;

        // Traverse both arrays using two
        //while (i < a.length && j < b.length)  why i need to put both why not j<b.length?

        //Why Do We Need Both Conditions?
        //Condition for Array a (i < a.length):
        //
        //This ensures that the pointer i doesn't go out of bounds for array a.
        //As we traverse array a, we need to make sure that we don’t exceed its length. If i is greater than or equal to a.length, we would be accessing an invalid index in array a.
        //Condition for Array b (j < b.length):
        //
        //This ensures that the pointer j doesn't go out of bounds for array b.
        //As we traverse array b, we need to make sure that we don’t exceed its length. If j is greater than or equal to b.length, we would be accessing an invalid index in array b.


        //Why Not Just j < b.length?
        //If you only used j < b.length, it would mean that you are only checking the condition for array b. But this approach has a flaw:
        //
        //What if i exceeds a.length before j exceeds b.length?
        //In that case, i could point to an invalid index in array a, and the program would throw an error or behave unpredictably.
        //For example, if array a is fully traversed but there are still elements left in b, you'd end up accessing out-of-bounds elements in a.


        //eg.int[] a = {1, 2, 3};
        //int[] b = {1, 3, 2, 4};
        // so that why both condition need to put
        while (i < a.length && j < b.length) {
            // a[i] smaller ha erukanum
            // illa next element ha check pananum . next element either equall ha erukanum
            // illana greater ha erukm
            // equal ha eruntha antha element found illa na antha element illa
            // false nu artham loop vitutu velile vanthurum.
            if (a[i] < b[j]) {
                // Element in a is smaller, move to the next element in a
                i++;
            } else if (a[i] == b[j]) {
                // Element found in both arrays, move to the next element in both arrays
                i++;
                j++;
            } else {
                // Element in b not found in a, not a subset
                return false;
            }
        }

        // If we have traversed all elements in b, it is a subset
        //eghuku return true ha podalamae
        // b than check panurom athan b podanum
        return j == b.length;
    }

    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};

        if (isSubset(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}