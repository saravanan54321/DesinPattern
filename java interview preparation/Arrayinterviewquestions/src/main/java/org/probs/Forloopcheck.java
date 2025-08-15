package org.probs;

public class Forloopcheck {
   int  checkk(){
       for (int i = 0; i < 5; i++) {

           for (int j = 0; j < 5; j++) {
               System.out.println(j);
               break;

           }}
       return 1;
   }

    public static void main(String[] args) {
            Forloopcheck f = new Forloopcheck();
            System.out.println(f.checkk());
    }
}
