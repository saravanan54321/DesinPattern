package org.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

// remove duplicate
//print dupliate
// how many occurence of element
public class Allinone {


    public static void main(String[] args) {

        String  s = "banana";
        char[] c = s.toCharArray();

        LinkedHashMap<Character,Integer> lm = new LinkedHashMap();


//        for(int i =0; i<c.length;i++){
//            if (lm.containsKey(c[i])){
//                lm.put(c[i],lm.get(c[i])+1);
//
//            }else{
//                lm.put(c[i],1);
//            }
//        }

        //2nd logic

        for(int i =0; i<c.length;i++){
            int count = lm.getOrDefault(c[i],0);
            lm.put(c[i],count+1);

        }
        StringBuilder res= new StringBuilder();

        for (Map.Entry<Character,Integer> c1:lm.entrySet()){

                System.out.println(c1.getKey() +" -------- "+c1.getValue() +"times ");


}}}
