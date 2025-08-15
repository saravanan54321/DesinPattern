package org.example;

//4.
public class MinandMaxelement {

        void minAndMax(int [] m){

            int largest = m[0];
            int smallest = m[0];
            for(int i=1; i<m.length;i++){
                // simply checks if the element is greater
                //put it in greatest
                // if it is smaller put it in smallest.
                if(largest<m[i]){
                    largest=m[i];
                } else if(smallest>m[i])
                        smallest=m[i];


                }
            System.out.println("largest: "+largest);
            System.out.println("smallest: "+smallest);
            }


    public static void main(String[] args) {

        int arr[] = {3, 2, 1, 56, 10000, 167};

        MinandMaxelement m = new MinandMaxelement();
        m.minAndMax(arr);


    }
        }






