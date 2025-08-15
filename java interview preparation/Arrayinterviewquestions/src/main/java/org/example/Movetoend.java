package org.example;


//7.
// q. Zeros ha last la vaikanum athan question
//{1,0,2,3,2,0,0,4,5}-input
//{1,2,3,4,5,0,0,0}-output
//3. things keep in mind
//1.j always point to  Zero
//2. swap and increase the j
//3. i vanthu j aprm than start agum.


//time complexity -

// first for loop vanthu kudthukurka array la first zero finf pananum
// so o(X)-> x is the length of an array
// second for loop ku n length ku iterate pananum  so (n-x)

public class Movetoend {


    // finding first  zero number in a array
    void   findFirstZero(int []a){
        int j=-1;
        for (int i=0;i<a.length;i++){
            // finding the index of first zeroth value
            if(a[i]==0){
                j=i;
                break;
            }

        }
        System.out.println("First Zero Found: "+j);



        //note the i here
        //int i=j+1= firt time initiliaze panurathuku than edhu work agum
        //second time lam edhu work agathu
        for(int i=j+1; i<a.length;i++){
            // checking next element is non zero
            // if it is swap and increase the j
            if(a[i]!=0){
                int temp =a[i];
                 a[i]=a[j];
                 a[j]=temp;
                 //always points to zero that why incrementing
                 j++;
            }
        }
    // just printing
        for (int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }





    public static void main(String[] args) {

        //int marr[]={1,0,2,3,2,0,0,4,5};
        int marr[]={1,0,2,3,0,2,4,0,5};
        Movetoend me = new Movetoend();

        me.findFirstZero(marr);


    }
}
