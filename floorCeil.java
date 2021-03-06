input:    
12.00

20

8

output:
15.36

15.0

16.0

16






import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip =  (double)tip_percent/100.0;
        double tipa = meal_cost * tip;
        double tax = (double)tax_percent/100.0;
        double taxa = meal_cost * tax;
        double totalcost = (meal_cost + tipa + taxa);
        double floor = (Math.floor(totalcost));
        double ceil = (Math.ceil(totalcost));
        System.out.println(totalcost);
        System.out.println(floor);
        System.out.println(ceil);
        
        String s =(Double.toString(totalcost));
        for(int i = 0; i < s.length(); i ++ ){
            if(s.charAt(i) == '.'){
               char p =  s.charAt(i+1);
               if (p > 0){
                   System.out.println((int)ceil);
               }
               else{
                   System.out.println((int)floor);
               }
               
            }
        }
       

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //System.out.println(meal_cost);

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         //System.out.println(tip_percent);

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         //System.out.println(tax_percent);

        solve(meal_cost, tip_percent, tax_percent);
         System.out.println();

        scanner.close();
    }
}
