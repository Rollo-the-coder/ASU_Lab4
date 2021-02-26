//========================================
//Lab4.java
//Name : Erik Christian Gotta
//ASU ID :
//Time taken to complete this lab: 60
//========================================

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int n = sc.nextInt();
        
        //odds
        for (int i = 1; i < n; i += 2) {
            System.out.print(i + ", ");
        }

        System.out.println();

        //evens
        for(int i = 2; i < n; i += 2) {
            System.out.print(i + ", ");
        }

        System.out.println();

        //while fib
        int i = 0;
        int fibOne = 0;
        int fibTwo = 1;
        
        System.out.print(fibOne + ", ");
        while (i < n - 1) {
            System.out.print(fibTwo + ", ");
            //Stores the original fibTwo since it is changed prior to fibOne update code
            int tempTwo = fibTwo;
           
            fibTwo = fibOne + fibTwo;
            fibOne = tempTwo;
            
            i++;
        }

        System.out.println();

        //for fib
        int forFibOne = 0;
        int forFibTwo = 1;

        System.out.print(forFibOne + ", ");
        for (i = 0 ; i < n - 1 ; i++) {
            System.out.print(forFibTwo + ", ");

            int tempTwo = forFibTwo;

            forFibTwo = forFibOne + forFibTwo;
            forFibOne = tempTwo;
        }


        sc.close();
    }
}
