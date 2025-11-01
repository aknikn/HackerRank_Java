//import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Solution005 {

    public static void main(String[] args) {
		String line = "================================";		
		Scanner sc = new Scanner(System.in);
		
		String[][] strs = new String[3][2];
		for(int i=0; i<3; i++) {
			String[] str = sc.nextLine().split(" ");;
			strs[i][0] = fifteenDigits(str[0]);
			strs[i][1] = threeDigits(str[1]);
		}
		sc.close();
		
		System.out.println(line);
		for(int j=0; j<3; j++) {
			System.out.println(strs[j][0]+strs[j][1]);
		}
		System.out.println(line);
	}
	
	// Left-aligned in space
	public static String fifteenDigits(String str) {
		int len = 15-str.length();
		for(int i=0; i<len; i++) {
			str += " ";
		}
		return str;
	}
	
	// Right-aligned in zero
	public static String threeDigits(String num) {
		int len = 3-num.length();
		for(int i=0; i<len; i++) {
			num = "0"+num;
		}
		return num;
    }
}