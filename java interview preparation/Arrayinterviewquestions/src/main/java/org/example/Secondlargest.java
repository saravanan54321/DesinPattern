package org.example;

//2.
public class Secondlargest {

//    int slargest(int [] sa){
//
//        int largest=sa[0];
//        // edhula min value -1 nu kuda kudukalam but adhuva array la eruntha
//        // athan min value nu set panurom
//        int second_largest= Integer.MIN_VALUE;
//
//
//
//        for (int i=1;i<sa.length;i++){
//
//
//            //just checki
//            //
//            // ng as usual the largest logic here
//            //if the incoming element is large than largest element
//            // swap the elements
//            if (sa[i]>largest) {
//                second_largest = largest;
//                largest = sa[i];
//
//               //this else if  for if the array contains any duplicate element
//                // largest>sa[i]-yethachu duplicate element eruntha atha avoid panurathukuthan
//
//                //sa[i])>second_largest-duplicate element adhuthu erukura element
//                // entha condition podalana again 7 ha  second largest ku assign agidum.
//                // greater than samllest ha check panuren appidi eruntha atha
//                // second largest ku assign pani vituran.
//
//            //vara element first ha vida smaller ha erukanum  second ha vida larger ha erukanum.
//            }else if(largest>sa[i]&&(sa[i])>second_largest){
//
//                second_largest=sa[i];
//            }
//
//        }
//        return second_largest;
//
//    }}




    int ssmallest(int [] sa){

        int smallest=sa[0];
        int second_smallest= Integer.MAX_VALUE;

        for (int i=1;i<sa.length;i++){
            if (sa[i]<smallest) {
                second_smallest = smallest;
                smallest = sa[i];
            }else if(smallest!=sa[i]&&(sa[i])<second_smallest){
                second_smallest=sa[i];
            }


        }
        return second_smallest;

    }

}
