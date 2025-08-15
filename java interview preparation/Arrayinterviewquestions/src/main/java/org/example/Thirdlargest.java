package org.example;

//3.
public class Thirdlargest {


    int Tlargest (int [] ta){

        int first=ta[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i=1;i< ta.length;i++){

            //input
            //
            // };
//        int [] arr = {1,2,4,7,7,5,6,6};
            if(ta[i]>first){
                third=second;
                second=first;
                first=ta[i];
                //vara element first vida samller ha erukanum second ha vida larger ha erukanum
            } else if (  first >ta[i] && ta[i]>second ) {
                third=second;
                second=ta[i];

                // vara element first,second  vida smaller ha erukanum third vida larger ha erukanum
            } else if ( first>ta[i]  && second >ta[i] && ta[i]>third) {
                third=ta[i];
            }

        }

        return third;

    }
}
