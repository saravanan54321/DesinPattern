package org.Strings;

public class Reversestring {


    public static void main(String[] args) {
        String s = "java";




       char[] c= s.toCharArray();

       int i =0;
       int j = c.length-1;

       while (i<j){

           char temp = c[i];
           c[i]=c[j];
           c[j]=temp;

        i++;
        j--;

       }

        System.out.println(new String(c));
    }
}
