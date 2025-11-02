//import java.io.*;
//import java.util.*;

import java.util.Scanner;

public class Solution010 {
		 // Write my code below
		
		static Scanner sc = new Scanner(System.in);
		static int B;
		static int H;	
		static boolean flag = false;
		
		static {
			try {
				B = sc.nextInt();
				H = sc.nextInt();
				
				if(0<B && 0<H) {
					flag = true;
				}else {
					System.out.print("java.lang.Exception: Breadth and height must be positive");
				}
				sc.close();
			}catch(Exception e) {
				System.out.print("java.lang.Exception: Breadth and height must be positive");
			}
			
		}
		
		// Write my code above
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
			
	}

}