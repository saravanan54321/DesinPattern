package org.example;

import java.util.Arrays;

//14
// everything in this.
//https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/

// time complexity 0(2n)
//first n vanthu n values ha count panurathuku atha oru forloop la poturupan
//second vanthu  n vanthu exixting array la values ha place panurathuku
// adhuku 3 forloop poturupan but n varikum poven so athan n nu consider panuren
// total ha 2n athan
public class Sorts012s {


    public static void main(String[] args) {

        int n =6;
        int[] arr = {0, 2, 1, 2, 0, 1};
        sortArray(arr,n);
    }

    private static void sortArray(int[] arr, int n) {
        //count the array based on 0,1,2
        int count0=0;
        int count1=0;
        int count2=0;


        // 0,1,2,edhelam count pani respective variable la store panuren
        for(int i=0;i<n;i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

            // eppa exsiting array va la entha count pana values lam
            //store panuren.
            for(int i =0;i<count0;i++){

                arr[i]=0;

            }
            // for eg count0 =2  na count1 =3 na
        // i<count1 pota  2 to 3 than loop run agum adhuku tham
        //count0+count1=5 eppa loop 2 la start agum 3 times run agum
        for(int i =count0;i<(count0+count1);i++){

            arr[i]=1;

        }

        for(int i =(count0+count1);i<n;i++){

            arr[i]=2;

        }


        System.out.println(Arrays.toString(arr));


    }
}
