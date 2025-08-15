package org.example;

//12
//https://www.youtube.com/watch?v=2D0D8HE6uak
//https://takeuforward.org/data-structure/find-the-repeating-and-missing-numbers/- code in the website

//if the question is counting go for hasing technique



//logic
//create one new array increase the count of the array based on the input values.
// take values of input array and map into new array index and increase the count
//take the value from the neww array check the value and retrun the index
// sumarry value ->index->value ->index
public class Hasing {

    private static int[]  findMissingandrepatingnumber(int[] input1) {

        int a = input1.length;
        // why a +1 means
        // conside you ha element 6 in the array you need to update the
        // count in the hash array . accoreding to hash array index six is the 7 the element that why

        //why i am usng another array
        // we already know 5 comes after four or before six
        // how we know we have learned in the childhood
        // its a pattern wright like wise wee need to set a pattern to refer
        // that is why we are
        //
        //
        //
        // creating this array
        int [] hash = new int[a+1];

        // create a hash array and fill the count values.

        for(int i =0; i<a;i++){
            // eppa value 3 ha eruntha 3 index la poi 1 value increase agum.
            // input value la array oda index value oda map pani athoda count ha
            // increase panuren.
            hash[input1[i]]++;

        }

        //reapting la value 2 varanum ,missing la value 2 varanum adhuku than
        // eppothiiku false ha set panuren
        int repeating =-1,missing=-1;
        // yedhuku one la erunthu start panuren
        // input la element one than eruku zero illa zero eruntha zero la erunthu
        // start pananum and logic mathanum
        // edhuva
        for (int  i =1 ; i<hash.length;i++){


            // index number ha asign panuren repeat ku
            //for eg index 1 la 2 count eruntha 1st number than duplicate
            // athan eppidi assign panuren
            // hash array la erunthu value eduthu check pani athoda index ha return panuren.
            //enga greater than 1 podurathu better.
            if (hash[i]==2) repeating=i;
            // yentha element 0 count eruko athod index ha assign paniduvan
            if(hash[i]==0) missing =i;

            // just condition ha true akitu poida vendiaythuthan
            if (repeating!=-1 && missing!=-1){

                break;
            }





        }
        int []  ans={repeating,missing};
        return ans;
    }


    public static void main(String[] args) {
        int [] input1= {4,3,6,2,1,1} ;

        int[] fin =findMissingandrepatingnumber(input1);
        System.out.println("Repeating "+fin[0]+" missing "+fin[1]);
    }






}
