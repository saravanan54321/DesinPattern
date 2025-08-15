package org.example;


//13.
import java.util.HashMap;
import java.util.Map;

//Check if two arrays are equal or not
//soluyion -https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
//go to org.probs.Solution

// logic thani ya hashmap ha create pani a array la ella elaments um dummy value set pana poren for eg 1

// aprm b elemnts ha use pani antha dummy values la zero aka poren. ellam ha zero agiduchuna
//return true or false.
public class Arrayequal {

    public static void main(String[] args) {
        //1.
//       int[] a = {1, 2, 5,4, 0};
        //2.
        //int[] a = {1, 2, 5};
        //3.
        int[] a = {1, 1, 2, 3};


        //1.
//      int [] b ={2, 4, 5, 0, 1};
        //2.
        //int [] b ={2, 4, 15};
        int[] b = {1, 2, 3, 3};
        System.out.println(Arrayequal.checkEqual(a,b));
    }

    private static boolean checkEqual(int[] a, int[] b) {

        Map<Integer,Integer> m =new HashMap();
        // edhu simple logic than two arrays oda length um same ha illana retrun false
        //base case mathiri vachiko
        if(a.length!=b.length) return false;        //
        // this for loop is for iterate a elements
        // process and store it n map
        for(int i:a){
            //already value ha eruka nu key use pani pakuren
            // eruntha extra 1 value ha increase paniduren
            if (m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else{
                // direct ha map la iterate agi  vara elements ku value 1 set panuren
                m.put(i,1);
            }
        }


        //b elements ha iterate panni map kuda compare pani oru value ha less panuren
        //for

        for(int i :b){
            // cheking the value is present in map
            // for eg b =2
            // if its not present in b simply returns true
            if(m.containsKey(i)){
                //get(2)=1 key 2 oda value 1
                //m.put(2,(1-1))
                m.put(i,m.get(i)-1);
            }else{
                return false;
            }



        }
        // iterate the map and check zero ilaya nu check panuren
        // ilana final ha true value ethachu eruntha false

        // why i need this
//        What happens if you remove it?
//                Consider these two arrays:
//
//
//        int[] a = {1, 1, 2, 3};
//        int[] b = {1, 2, 3, 3};
//        The map after processing a: {1=2, 2=1, 3=1}
//        The map after processing b: {1=1, 2=0, 3=0}
//        Since 1 still has a count of 1, the arrays are not equal, and the final loop correctly returns false.
//       If you remove that loop, the function might incorrectly return true, assuming all elements in b were present in a,
//       without checking if their frequencies match.

        //iterating the hashmap
        for(int i :m.keySet()){
            if(m.get(i)!=0){
                return false;
            }
        }

        return true;

    }
}
