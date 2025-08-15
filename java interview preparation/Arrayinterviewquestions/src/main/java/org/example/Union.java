package org.example;

import java.util.ArrayList;

//10.
//input -int arr1[] = {1,1,2,3,4,5};
//        int arr2[] = {2,3,4,4,5,6};

//output -{1 2 3 4 5 6}

//logic - oru array ha edhu enoru array kluda compare panitu
// antha ele elemnt um 3rd arrya la add panirun
// edhu eppidi condition check panurathuna oru array ha full ha iterate panitu
// for i iterate pani mudija odana 5 length eruku value.but  j la 2 than erukum.
// balance eruka array layum ethachu element eruku antha element  3rd array la  eruka nu pathutu
// illana add paniduran.


//logic - 2 array um compare panuren
// yentha element lesser nu pakuren yedhu lesser ho adhu arraylist la erukan pakuren eruntha
//vitutrn illana add panuren.
// etha pathutu sum 14 paru  adhu 2 type

public class Union {


   static ArrayList<Integer> FindUnion(int[] a1,int[] a2,int n,int m) {


       int i = 0, j = 0;
       ArrayList<Integer> un = new ArrayList<>();

       // ethachu oru array full agiduchunala velile vanthurum
       // adhuku than rendu and la poturukan
       while (i < n && j < m) {

            // first array la erukaura elemnt less ha erukunu second array la erukura
           //element kuda pakuren.

           // edhuku equal to poturkana  duplicate element erukalam
           // eg frst array la element 2 erukum
           // second array layum elemnt 2 eruka vaipu erukum adhuku

           if (a1[i] <= a2[j]) {

               // 3 rd ha oru array erukum adhu frst empty ha pakuren
               // empty ha eruntha direct ha add paniduren.
               // apppi illa na 3rd array la erukura element ha eduthu already erukanu
               // pakanum eruntha i matum increase pananum ilana add panitu i ha increase pananum
                //  un.get(un.size() - 1)-i think input sort agieruku adhuku than entha logic crt ha
               // vela seiyuthu .sort agala na edhu olunga vela seiyathu.
               if (un.size() == 0 || un.get(un.size() - 1) != a1[i]){
                   un.add(a1[i]);

                   }
               i++;

               }else {


               // i < j ha ilana entha condition execute agum
               //  // 3 rd ha oru array erukum adhu frst empty ha pakuren
               //  empty ha eruntha direct ha add paniduren.
               // apppi illa na 3rd array la erukura element ha eduthu already erukanu
               // pakanum eruntha j matum increase pananum ilana add panitu j ha increase pananum
               //un.get(un.size() - 1)-yedhuku -1 na last element ha edukurathuku
               // mela kuduthurka input ku entha logic kulla eruka add method pogathu
               //[1,1,3,5]
               //[2,4,4,5,6]
               //above input ku ulla value add agum.
               //beacuse 2 is missing in 1st array
               // miss agala na j matum increase aguthu
               if (un.size() == 0 || un.get(un.size() - 1) != a2[j]){
                   un.add(a2[j]);
                   }
               j++;
           }


       }
        // edhu balance ha erukura element ha check panum erunth adhayum 3rd array la add panidum
       while (i<n){
           if(un.get(un.size() - 1) != a1[i]){
               un.add(a1[i]);

           }
           i++;
       }
       while (j<m){
           if(un.get(un.size() - 1) != a2[j]){
               un.add(a2[j]);

           }
           j++;
       }


       return un;

   }

    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,4,5};
        int arr2[] = {2,3,4,4,5,6};
        int n = arr1.length, m = arr2.length;
        ArrayList<Integer> u = FindUnion(arr1,arr2,n,m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: u)
            System.out.print(val+" ");



    }
}
