package org.example;

//5.
public class SortedArray {

    // checking given array has been sorted or not

    boolean SortArray(int[] b){

        for(int i=1;i<b.length;i++){
            //just checking previous element is smaller
            //if any of the element is greater return false.

            if(b[i]>=b[i-1]){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
