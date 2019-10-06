JAVA:
    A byte is an 8-bit signed integer.
    A short is a 16-bit signed integer.
    An int is a 32-bit signed integer.
    A long is a 64-bit signed integer.


Given an input integer, you must determine which primitive data types are capable of properly storing that input.

expected input:
    5 //number of test cases

    -150

    150000

    1500000000

    213333333333333333333333333333333333

    -100000000000000

expected output:

-150 can be fitted in:

* short

* int

* long

150000 can be fitted in:

* int

* long

1500000000 can be fitted in:

* int

* long

213333333333333333333333333333333333 can't be fitted anywhere.

-100000000000000 can be fitted in:

* long




Program:

import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                
                
                System.out.println(x+" can be fitted in:");
                if(x >= Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
                //if(x>=-128 && x<=127){
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                 else if(x >= Short.MIN_VALUE && x<=Short.MAX_VALUE){
                //else if(x >= -32768 && x<=32767){
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x >= Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
                //else if(x >= -2147483648 && x<=2147483647){
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x >= Long.MIN_VALUE && x<=Long.MAX_VALUE){
                    System.out.println("* long");
                }
                //Complete the code
            }
            
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
    }
}
}



