package org.probs;



// User function Template for Java

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int i:a)
        {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
        }
        System.out.println(map);
        for(int i:b)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i)-1);
            }
            else
                return false;
        }
        for(Integer i:map.keySet())
            if(map.get(i)!=0)
                return false;


        return true;
        // Your code here
    }

    public static void main(String[] args) {

       int[] a = {1, 2, 5, 4, 0};
        //int[] a = {1, 2, 5};

        int [] b ={2, 4, 5, 0, 1};
        //int [] b ={2, 4, 15};
        System.out.println(Solution.checkEqual(a,b));


    }
}
