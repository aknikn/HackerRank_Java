//import java.io.*;
//import java.util.*;

import java.util.Scanner;

public class Solution004 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double dou = sc.nextDouble();
		
		sc.nextLine();
		String str = sc.nextLine();
		sc.close();
		
		System.out.println("String: "+str);
		System.out.println("Double: "+dou);
		System.out.println("Int: "+num);
    }
}