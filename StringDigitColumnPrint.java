import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //%03 means 3 digit will apear with lading digit 0
                //%-14 means space between string and digits is 15
                //%n means print in new row
                System.out.printf("%-14s %03d ", s1, x);
                //Complete this line
                /*if(x < 100){
                    if(s1.length() > 3){
                     //System.out.println(s1 + "         " + "0" +x ); 
                      
                     
                    }
                    else
                     System.out.println(s1 + "            " + "0" +x);
                }
                else //if(s1.length() > 3)
                System.out.println(s1 + "           " +x);
                
            }*/
            }
            System.out.println("================================");

    }
}
