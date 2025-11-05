import java.io.*;
import java.util.*;

public class Solution014 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        
        // sum the lengths of A and B.
        System.out.println(A.length()+B.length());
        
        // if A is lexicographically greater than B , print "Yes".
        // Otherwise print "No" instead.
        int posA = getPosition(A);
        int posB = getPosition(B);
        
        if(posB<posA){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        // Capitalize the first letter in both A and B.
        // Print them on a single line, separated by a space.
        String strA = capitaliseInitial(A);
        String strB = capitaliseInitial(B);
        System.out.println(strA+" "+strB);
    }
    
    // get the position of the initial character of str
    public static int getPosition(String str){
        int result = 0;
        String ini = str.substring(0, 1).toUpperCase();
        String[] alps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        for(int i=0; i<alps.length; i++){
            if(alps[i].equals(ini)){
                result = i;
                break;
            }
        }
        return result;
    }
    
 // capitalise the initial character of str
    public static String capitaliseInitial(String str){
        String ini = str.substring(0, 1);
        String result = ini.toUpperCase();
        String[] tmp = str.split("");
        String[] left = new String[str.length()];
        
        for(int t=0; t<tmp.length; t++){
            if(0<t){
                left[t-1] = tmp[t];
            }
        }
        
        for(int i=1; i<left.length; i++){
            result += left[i];
        }
        return result;
    }
}



