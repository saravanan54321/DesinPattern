package org.example;

import java.util.ArrayList;

// subsetofarray la 2nd problem paru.
//https://www.youtube.com/watch?v=wvcQg43_V8U-reference
//11.
//input
//int [] a={1,2,2,3,3,4,5,6};
//int [] b={2,3,3,5,6,6,7};
//note arrays has been sorted
//output- two array layum common pairs erukanum
//like a[1] and b[0] la 2 eruku atha eduthuka adhu oru pair
//netx a[2] =2 edhuku oru pair b la illa so next element ku move agidanum
// simple men and women pair panura mathiri vachuka
// oru pair kedacha odana next pair thedi podanum
//2pointer concept use panirukan
// assume given arrays are sorted then only it is correct
// common ha eruntha matum than add panuren like 2=2 ,3==3 etc
public class Intersection {
    private static  ArrayList intersetion(int[] a, int[] b, ArrayList al) {
        int i=0;
        int j=0;
        int n = a.length;
        int m = b.length;
        while(i<n && j<m){

            // rule padi a and b um same ha erukanum
            // a chinna paya nu check panuren
            // chinna payana eruntha vera payana pakuren
            if (a[i]<b[j]){
                i++;

             // b
                //
                // pona nu pakuren chinna pona eruntha
                //vera payna pakuren

                // int [] a={1,2,2,3,3,4,5,6};
                //        int [] b={0,2,3,3,5,6,6,7};
            } else if (b[j]<a[i]) {
                j++;
            }else{
                // erandu perum equal ha eruntha add panidanum.
                // en b[j] ha adda pana maturen
                // enga intersection panuren .athavathu common ha eruka element ha add panuren
                // common h aeruntha a laya element present agirukum.
                // so athan add panuren
                al.add(a[i]);
                i++;
                j++;
            }


        }


        return al;
    }


    public static void main(String[] args) {

        int [] a={1,2,2,3,3,4,5,6};
        int [] b={2,3,3,5,6,6,7};
        ArrayList al = new ArrayList();
        System.out.println(intersetion(a,b,al));

    }


}
