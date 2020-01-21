import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int[] res;
   static int alice;
   static int Bob;
    // Complete the compareTriplets function below.
    static int[] compareTriplets(int[] a, int[] b) {
        res = new int[2];
        for (int i = 0; i < 3; i++){
            if(a[i] > b[i]){
                alice = 1;
                Bob = 0;
            }
            else if(a[i] == b[i]){
                alice = 0;
                Bob = 0;
            }
            else if(a[i] < b[i]){
                alice = 0;
                Bob = 1;
            }
            res[0] = alice;
            res[1] = Bob;
            
        }
       
        return res;


    }

    public static void main(String[] args) throws IOException {
       Scanner m = new Scanner(System.in);
        String alice = m.nextLine();
        String Bob = m.nextLine();

        String[] sa = alice.split(" ");
        String[] sb = Bob.split(" ");

        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(sa[i]);
            a[i] = aItem;
        }
        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(sb[i]);
            b[i] = aItem;
        }

        int[] result = compareTriplets(a, b);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        
        }

       
    }
}
