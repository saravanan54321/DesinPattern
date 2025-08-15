package org.example;

//15.
//3. types la erukum elathayum paru
//1.is type poturupan
//2nd poturpan - edhu intersection um same ha erukum
//3rd type hahsset atha entha link la pathuka
//https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/#expected-approach-using-hashing-om-n-time-and-om-auxiliary-space
//3rd -edhu arrays equal kitathata  onu
//1.

//public class SubsetofArray {
//
//
//
//    //1. edhoda time complexity m*n
//    //m vanthu b array voda input size
//    //n vanthu a array oda input size
//    // oru oru m kum ela n num multiply panuven
//    // so athan m*n
//    private static boolean findSubset(int[] a, int[] b) {
//
//
//        for (int i=0;i<b.length;i++){
//            boolean found=false;
//            for (int j=0;j<a.length;j++){
//                //edhu vanthu oru element ha than check panuthu
//                // break vanthu inner loop vitutu poidum aprm kela eruka line
//                // ha execute panum aprm mela for loop ku poidum
//                //edhu va return pota two for loop ha vitutu podium
//                //enga sila element b la eruku sila element a la illa
//                // so eppidi oru scenario vantha break podurathu best
//                // edhuku boolean  value en true nu set paniran na
//                // etha fale panurathukuthan
//                // b la eruka element a la illana
//                // enga vanthu false return agum but edhuva a la element eruntha
//                //etha false pananum adhuku than true
//                //if(!found){
//                //                return false;
//                //            }
//
//                // break -> adhutha element ha check pananum adhuku than edhu
//                //found=true;- kelae eruka if statemnet kaga
//                if(b[i]==a[j]){
//                    found=true;
//                    break;
//                }
//
//
//
//            }
//            // etha outer forloop la potuupan.
//            // edhu execute ana odana for loop ha vita poidum
//            // element vanthu a la present agala na etha use pani false
//
//
//            if(!found){
//                return false;
//            }
//
//        }
//        // ehdula elam crt na enga vatum retrun true pannum
//        // final ha ela elemen um eruntha matum than enga true set agum.
//        return true;
//    }
//    public static void main(String[] args) {
//        int[] a = {11, 1, 13, 21, 3, 7};
//        int[] b = {11, 3, 7};
//
//        //1.
////       if( findSubset(a,b)){
////           System.out.println("Array is  present");
////       }else {
////           System.out.println("Array is not present");
////       }
//
//
//
//
//
//
//    }
//
//
//
//
//}


//------------------------------------------------------



//-------------------------------
//2.
//intersection problem paru
// difference between two problem - intersection la extra oru if statement poturpan
// SubsetofArray element illa false return pannaum .but intersection la element illana next elemnt ha pakanmm.
import java.util.Arrays;

class GfG {
    static boolean isSubset(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);



        int i = 0;
        int j = 0;

//         Traverse both arrays using two
        //while (i < a.length && j < b.length)  why i need to put both why not j<b.length?

        //Why Do We Need Both Conditions?
        //Condition for Array a (i < a.length):
        //
        //This ensures that the pointer i doesn't go out of bounds for array a.
        //As we traverse array a, we need to make sure that we don’t exceed its length. If i is greater than or equal to a.length, we would be accessing an invalid index in array a.
        //Condition for Array b (j < b.length):
        //
        //This ensures that the pointer j doesn't go out of bounds for array b.
        //As we traverse array b, we need to make sure that we don’t exceed its length. If j is greater than or equal to b.length, we would be accessing an invalid index in array b.


        //Why Not Just j < b.length?
        //If you only used j < b.length, it would mean that you are only checking the condition for array b. But this approach has a flaw:
        //
        //What if i exceeds a.length before j exceeds b.length?
        //In that case, i could point to an invalid index in array a, and the program would throw an error or behave unpredictably.
        //For example, if array a is fully traversed but there are still elements left in b, you'd end up accessing out-of-bounds elements in a.


        //eg.int[] a = {1, 2, 3};
        //int[] b = {1, 3, 2, 4};

 ////int[] a = {10, 5, 2, 23, 19};
        ////int[] b = {19, 5, 3};
        // so that why both condition need to put
        while (i < a.length && j < b.length) {
            // a[i] smaller ha erukanum
            // illa next element ha check pananum . next element either equall ha erukanum
            // illana greater ha erukm
            // equal ha eruntha antha element found illa na antha element illa
            // false nu artham loop vitutu velile vanthurum.
            if (a[i] < b[j]) {
                // Element in a is smaller, move to the next element in a
                i++;
            } else if (a[i] == b[j]) {
                // Element found in both arrays, move to the next element in both arrays
                i++;
                j++;
            } else {
                // Element in b not found in a, not a subset
                return false;
            }
        }

        // If we have traversed all elements in b, it is a subset
        //eghuku return true ha podalamae
        // b than check panurom athan b podanum
        return j == b.length;
    }

    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};

        if (isSubset(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

//