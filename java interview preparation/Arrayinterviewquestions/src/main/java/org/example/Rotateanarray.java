package org.example;

//8
// Left rotate an array by one place
// frst element ha last  la vaikanum.
//output-[2,3,4,5,1]
//time complexity is O(N)
//space complexity os 0(1)- vera array use panala same array than use panna athan eppidi.

public class Rotateanarray {

         void   arrayRoatation(int [] b){

             // etha assign panala na  frts element poidum
               int temp = b[0];
               for(int i=1;i<b.length;i++){

                   // just placing the element to previous element

                   //4. 4=5
                   //3. 3=4
                   //2. 2=3
                   //1. 1=2
                   b[i-1]=b[i];
               }
                    // assign panna first element ha last la reaasign panuren.
                    //5=1
                   b[b.length-1]=temp;

               // just printing the value
             for(int i=0;i<b.length;i++){
                 System.out.println(b[i]);
             }



            }


    public static void main(String[] args) {

        int [] b={1,2,3,4,5};

        Rotateanarray r = new Rotateanarray();
        r.arrayRoatation(b);

    }
}
