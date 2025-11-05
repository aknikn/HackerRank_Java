// import java.io.*;
 import java.util.Scanner;


public class Execution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        
        // sum the lengths of A and B.
        int lenA = A.length();
        int lenB = B.length();
        System.out.println(lenA+lenB);
        
        // if A is lexicographically greater than B , print "Yes".
        // Otherwise print "No" instead.
        if(lenA<lenB){
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
    
    public static String capitaliseInitial(String str){
        String ini = str.substring(0, 1);
        String result = ini.toUpperCase();
        
        String[] left = str.split("");
        for(int i=1; i<str.length(); i++){
            result += left[i];
        }
        return result;

	}
}