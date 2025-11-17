package org.Strings;


//we cant use hashmap
//output -> a2b1c5a3- this is the output we want
// if we use hashmap here the out will be like a7b1c3
public class Stringcompression {



    public static void main(String[] args) {

        String str = "aabcccccaaa";

        StringBuilder sb = new StringBuilder();
        int count=0;
        for (int i =0;i<str.length();i++){
            count++;

            //i+1>=str.length() this should comes frts in the if condition illa na array index bound excpeption adikum
            // why we need this ?i+1>=str.length() to take last element count
            //str.charAt(i)!=str.charAt(i+1) this is the actual condition
            //if both elements not equal append the  previous element and its count
            if( i+1>=str.length()||str.charAt(i)!=str.charAt(i+1) ){
                sb.append(str.charAt(i));
                sb.append(count);
                count=0;

            }

        }

        System.out.println(sb);


    }
}
