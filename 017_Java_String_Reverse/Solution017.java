import java.io.*;
import java.util.*;

public class Solution017 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here.
           Print output to STDOUT. */
        sc.close();
        if (isPalindrome(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
    public static boolean isPalindrome(String str){
        String revStr = new StringBuilder(str).reverse().toString();
        return revStr.equals(str);
    }
}



