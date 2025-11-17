package org.Strings;


//input-a2b1c5a3
//ouput -aabcccccaaa
// we deep dived into ASCII value and used that
public class Stringcompressionreverse {

    public static void main(String[] args) {

        String s = "a2b1c5a3";

        StringBuilder sb = new StringBuilder();

        for(int i =0; i<s.length();i+=2){

            char c = s.charAt(i);
            int k  = s.charAt(i+1)-'0';
            for(int j =0; j<k;j++){

                sb.append(c);
            }

        }

        System.out.println(sb);



    }
}
