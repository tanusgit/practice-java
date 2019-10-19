input:
    3

    sam 99912222

    tom 11122222

    harry 12299933

    sam

    edward

    harry
    
 output:
    sam=99912222

    Not found

    harry=12299933

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String s = in.next();
            int phone = in.nextInt();
            myMap.put(s, phone);

        }
        while(in.hasNext()){
            String name = in.next();
            //search in myMap if the key exists, containsKey return true or false
            if(myMap.containsKey(name)){
                //myMap.get returns the paired value with name
                System.out.println(name + "=" + myMap.get(name));
            }
            else
            System.out.println("Not found");

            
        }
     
        in.close();
        
        // Create a Map of String Keys to String Values, implemented by the HashMap class
    }
}

