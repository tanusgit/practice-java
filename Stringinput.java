input:
    12

    4.0

    is the best place to learn and practice coding!
output:
16

8.0

HackerRank is the best place to learn and practice coding!




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        double n = scan.nextDouble();
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        int r = m + i;
        double k = d + n;
        System.out.println(r);
        System.out.println(k);
        System.out.println( s + str1);
        scan.close();
    }
}
