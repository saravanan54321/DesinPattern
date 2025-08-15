package org.example;

//9
//rotate an array by d times
// d may be 3 or 10 etc

// time complexity
//o(d)+o(n-d)+o(d)=o(d)
//input=int [] r2={1,2,3,4,5,6,7};
//output=int [] r2={4,5,6,7,1,2,3,};
public class Rotatearray2 {


    //brute force approach


    void arrayRoatation2(int [] r, int[] t,int d){

        //output for this loop
        //[4,5,6,7,5,6,7]
        // shifting remaining  part

        for (int i =d;i<r.length;i++ ){ //O(d)


                r[i-d]=r[i]; //(n-d) because of shifting

        }
        // shifting 1,2,3
        //[4,5,6,7,1,2,3]

        for(int i =0 ; i<t.length;i++){
            r[i+(r.length-d)]=t[i];

        }
        //just printing the value.
        for (int i =0;i<r.length;i++ ){
            System.out.println(r[i]);

        }

    }


    public static void main(String[] args) {
        int [] r2={1,2,3,4,5,6,7};


        //storing some value in temp other this values erased
        int [] temp={1,2,3};// O(d)- space complexity
        int d=3;
        Rotatearray2 r = new Rotatearray2();
        r.arrayRoatation2(r2,temp,d);
    }

}
