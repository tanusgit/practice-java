import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a;
            int  u = 1;
            //System.out.print(s + " ");
            //for(int k = 1; k < n; k++){
                for(int l = 0; l<n; l++){
                    s = s + (u*b);
                    u = 2*u;
                    System.out.print(s + " ");
                }
              System.out.print("\n"); 
        }
        in.close();
    }
}
