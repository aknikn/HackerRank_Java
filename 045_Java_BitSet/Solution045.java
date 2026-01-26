import java.io.*;
import java.util.*;

public class Solution045 {
    public static void main(String[] args) {
        /* Enter your code here.
           Read input from STDIN.
           Print output to STDOUT.
           Your class should be named Solution.*/
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());  
        
        BitSet b1 = new BitSet(N);
        BitSet b2 = new BitSet(N);
        for(int i=0; i<M; i++){
            String command = sc.next();
            int first = Integer.parseInt(sc.next());
            int second = Integer.parseInt(sc.next());
            
            switch(command){
                case "AND":
                    if(first==1){
                        b1.and(b2);
                    }else{
                        b2.and(b1);
                    }
                    break;
                    
                case "OR":
                    if(first==1){
                        b1.or(b2);
                    }else{
                        b2.or(b1);
                    }
                    break;
                    
                case "XOR":
                    if(first==1){
                        b1.xor(b2);
                    }else{
                        b2.xor(b1);
                    }
                    break;
                    
                case "FLIP":
                    if(first==1){
                        b1.flip(second);
                    }else{
                        b2.flip(second);
                    }
                    break;
                    
                case "SET":
                    if(first==1){
                        b1.set(second);
                    }else{
                        b2.set(second);
                    }
                    break;
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
        sc.close();
    }
}