package org.example;

import java.util.*;

public class SpecialNumbers2 {


    public static ArrayList sn (ArrayList ab ,ArrayList ar,int[] a){



        int sum =0;
        boolean b = false;
        for(int i =0;i< a.length;i++){
            sum=0;
            for(int j=1;j<a[i];j++){
                if(a[i]%j==0){
                    sum=sum+j;
                }
                b=true;

            }
            if (b){
                ar.add(sum);
            }

        }





        Iterator <Integer> it  = ar.iterator();

        while(it.hasNext()){

            if(!ab.contains(it.next())){

                it.remove();
            }
        }




        return ar;
    }

    public static void main(String[] args) {

        //int [] a={1,6,3};
       // int [] a={2,54,22,14,66};
        //int [] a={24,5,11,25};

        int [] a={12, 25, 496};
        // converting the above input to  arralylist
        ArrayList<Integer>  ab = new ArrayList<>();
        // storing the resultant
        ArrayList<Integer> ar = new ArrayList<>();
        for(Integer ad:a){
            ab.add(ad);



        }

        ArrayList  fArralist=SpecialNumbers2.sn(ab,ar,a);
        if(fArralist.size()==0){
            System.out.println(-1);
        }
        else {
            for(int i =1;i<fArralist.size();i++){
                for(int j =0;j<ab.size()-1;j++){

                    if(fArralist.get(i)==ab.get(j)){
                        if(fArralist.get(i-1)==ab.get(j+1)){
                            fArralist.set((int)(i-1),(ab.get(j)));
                            fArralist.set((int)(i),(ab.get(j+1)));

                        }

                    }

                }

            }

            System.out.println(fArralist);



        }








    }
}
