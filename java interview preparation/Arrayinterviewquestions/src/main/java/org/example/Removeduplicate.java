package org.example;

import java.util.Arrays;

//6.
//parrelley learn move to end
//in this problem checks how many unique elements in the array and count that
public class Removeduplicate {


    int duplicate(int arr[]){
        int i=0;
        int count=1;

        for(int j=1; j<arr.length;j++){




            //4-2!=3


            //2->1!=2
            //1-> 1!=1
            if(arr[i]!=arr[j]){

                //4->arr[2] IS 2=3
                //2->arr[1] IS 1=2
//                arr[i+1]=arr[j];
//                //---------
//                i++;
                //or
                // 2nd logic
                i=j;
                count++;

            }


        }
        // below print line is for my reference
        System.out.println(Arrays.toString(arr));

        // second logic
        return count;
        //return i+1;
    }
}
