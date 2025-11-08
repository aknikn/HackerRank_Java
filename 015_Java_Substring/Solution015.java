import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        
        System.out.println(S.substring(start, end));
    }
}