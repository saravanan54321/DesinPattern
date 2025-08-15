package org.example;

import java.util.ArrayList;
import java.util.List;
// check the word question is there
public class AlternateOddEven {

   // String instr = "h93@5213#w4rld&"; input
    //9234513-output check the word for the question
    public static void main(String[] args) {
//        String instr = "h93@5213#w4rld&";

        String instr = "A5c67r21i@p#8t";

        // store odd and evennumbers
            List<Character> oddDigits= new ArrayList<>();
            List<Character> evenDigits= new ArrayList<>();
            int specialCharacterCount=0;

        // to iterarte and segregate odd or even digit and count the special character
        char[] ch = instr.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){

                if(ch[i]%2==0){
                evenDigits.add(ch[i]);
                }

                else{
                    oddDigits.add(ch[i]);
                }

                } else if(!Character.isLetter(ch[i])) {
                    specialCharacterCount++;
            }

        }

        // output string
        StringBuilder outStr= new StringBuilder();
        //condition for start with odd or evenum as per the question
        boolean isODD = (specialCharacterCount%2==1);

        int i=0;int j=0;
        // core logic
        // appending numbers alternnatively

        while(i<oddDigits.size() && j<evenDigits.size()){

        //this condition is used to check  . appending is start with odd or even base don this question
            // we are determing this
        if(isODD){
            outStr.append(oddDigits.get(i++));
            outStr.append(evenDigits.get(j++));

        }else {
            outStr.append(evenDigits.get(j++));
            outStr.append(oddDigits.get(i++));
        }

        }

        // remainig number we are adding
        while(i<oddDigits.size()){
            outStr.append(oddDigits.get(i++));
        }
        // remainig number we are adding
        while(j<evenDigits.size()){
            outStr.append(evenDigits.get(j++));
        }

        System.out.println(outStr);
    }
}
