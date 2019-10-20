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
        int maxCount = 0;
        String one = "1";
        String result = "";

        for (int i = 0; i < binaryString.length(); i++){
            //taking char value at ith position in the string
            char c = binaryString.charAt(i);
            //converting char to String
            String stringC = Character.toString(c);
            if(stringC.equals(one)){
                result = result + stringC;
                count = count +1;
                if(count > maxCount){
                    maxCount = count;
                }
            }
            else{
                 count = 0;
            }

        }
           /* System.out.println("made a string from the binary string which has only 1 in it " +one);
            System.out.println("printing the binary value in a string of an int " +binaryString);
            System.out.println("printing how many times 1 appeared in the Binary string " + count);*/
            System.out.print( maxCount);
            //System.out.print("count "+ count);

        

        scanner.close();
    }
}
