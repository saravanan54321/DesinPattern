package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Specialnumbers {

    private static int sumOfNumDivisor(int singleElementIsComing) {


        if(singleElementIsComing==1) return 0;
        // why sum =1 means vara number yeppidiyum 1 ala dive agum so
        // atha yedhuku sum = 0+1 pani sum =1 nu agum adhuku direct ha va sum=1 nu start panidalam.

        int sum =1;
        //singleElementIsComing=6
        // sqrt pana 2.4 varum so loop oru vati than run agum
        //sum=1+2+3 =6 eppidi than pananum but epothiku 1+2 than add agum
        //2. use this
        //singleElementIsComing=36
        //sqrt pana 6 varikum loop suthum
        // balance divisor lam kela erukurathu pathukum
        for(int i=2;i<=Math.sqrt(singleElementIsComing);i++){


                if(singleElementIsComing%i==0){
                    sum=sum+i;

                    //conside your singleElementIsComing=36
                    // 36 is a perfect square meaning 6*6=36;
                    //divisor of 36 is 1,2,3,4,6,9,12,18,


                    //36/2=18,36/3=12,36/4=9,36/6=6,36/9=4,36/12=3,36/18=2



                    // why ! equal to potu check panuren na mela ya 6 divisior add agidum
                    // enga again add aga kudathunu than  eppidid pdouren
                    // eppa 9 la erunthu add agum
                    if(i!=singleElementIsComing/i){

                        sum=sum+(singleElementIsComing/i);

                    }
                }

        }
        return sum;
    }

    public static void main(String[] args) {

        String s="2,54,22,14,66";

      String[] sarr = s.split(",");
      int [] numsArray=new int[sarr.length];

      //for faster insertion and faster lookup i am using this
      Set<Integer> numSet = new HashSet<>();

      // converting string array into int array;
        for(int i=0;i< sarr.length;i++){
            numsArray[i]=Integer.parseInt(sarr[i]);
            numSet.add(numsArray[i]);
        }

        List<Integer> specialNumbers=new ArrayList<>();
        // processing the input array
        for(int i=0;i<numsArray.length;i++){

           int  totalsumOfNumDivisor=  sumOfNumDivisor(numsArray[i]);

           // checking using hashset numSet  beacuse of fasterlookup

           if(numSet.contains(totalsumOfNumDivisor)){
               specialNumbers.add(totalsumOfNumDivisor);
           };

    }
       //input order padi print panurthuku eppidi

        List<Integer>  finalOutput = new ArrayList<>();
        for(int num: numsArray){
            if(specialNumbers.contains(num))
            {
                finalOutput.add(num);
            }

        }

        System.out.println(finalOutput);


}}
