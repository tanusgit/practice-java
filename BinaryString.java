import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //Integer.toBinaryString(int n) converts an int to a binary string
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        String givenone = "1";
        String one = "";
        for (int i = 0; i < binaryString.length(); i++){
                char y = binaryString.charAt(i);
               // System.out.println("printing char " +y);
               //converting char to String
                String ya = Character.toString(y);
               // System.out.println("printing string " +ya);
               // boolean ma = ya.equals(givenone);
               // System.out.println("printing ma " + ma);
                if(ya.equals(givenone)){
                one = one + ya;
               // System.out.println("printing the final string " +one);
                count = count +1;
            }
        }
            System.out.println("made a string from the binary string which has only 1 in it " +one);
            System.out.println("printing the binary value in a string of an int " +binaryString);
            System.out.println("printing how many times 1 appeared in the Binary string " + count);
        

        scanner.close();
    }
}
