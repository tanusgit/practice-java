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
            int s = a+b;
            //System.out.print(s + " ");
            for(int k = 1; k < n+1; k++){
                if(k==1){
                    s = s;
                }
                if(k==2){
                    s = s + (2*b);
                }
                if(k==3){
                    s = s + (2*2*b);
                }
                if(k==4){
                    s = s + (2*2*2*b);
                }
                if(k==5){
                    s = s + (2*2*2*2*b);
                }
                if(k==6){
                    s = s + (2*2*2*2*2*b);
                }
                if(k==7){
                    s = s + (2*2*2*2*2*2*b);
                }
                if(k==8){
                    s = s + (2*2*2*2*2*2*2*b);
                }
                if(k==9){
                    s = s + (2*2*2*2*2*2*2*2*b);
                }
                if(k==10){
                    s = s + (2*2*2*2*2*2*2*2*2*b);
                }

                System.out.print(s + " ");
            }
              System.out.print("\n"); 
        }
        in.close();
    }
}

