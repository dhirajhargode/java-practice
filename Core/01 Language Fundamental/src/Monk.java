package com.company.module.submodule;

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Monk {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        Scanner s = new Scanner(System.in);
      
          int T = s.nextInt();
          int N=s.nextInt();// Reading input from STDIN
          String[] arr=new String[N];
          String[] arr2=new String[N];
          for(int i=0;i<N;i++){
              arr[i]=s.nextLine();
              
          }   // Writing output to STDOUT
       System.out.println(arr);
       System.out.println(arr2);
        }
          

          // Write your code here
          

      }
  
