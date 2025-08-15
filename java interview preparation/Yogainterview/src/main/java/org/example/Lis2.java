package org.example;

import java.util.ArrayList;

public class Lis2 {


    int sub (int [] l){
        int k =0;

        int final_count=1;
        //{4,3,5,1,6}
        // loop will run 4 times
        for(int i=1;i<l.length;i++ ){

            if(l[k]<l[i]){
                k=i;
                final_count++;
            }



        }

        System.out.println(final_count);
        // kela eruka return dummy;
        return 1;
    }
}
