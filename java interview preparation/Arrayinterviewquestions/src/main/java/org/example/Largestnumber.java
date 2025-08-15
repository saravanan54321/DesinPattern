package org.example;

//1.
public class Largestnumber {


 //considering ln is the largest number in the array
    int  FindLargestNumber(int [] a,int ln){

        for (int i=1;i<a.length;i++){
        //simply checking if any of the incoming element is greater than
            //largest just assign the element to largest.



            //4->2>3
            //3->5>3
            //2->1>3
            //1->2>3
            if(a[i]>ln){

                //3-> 3=5
                ln=a[i];
            }
        }

        return ln;
    }

}
