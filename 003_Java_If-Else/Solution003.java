//import java.io.*;
import java.util.Scanner;

public class Solution003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		String result = "";
		if(num%2==1) {
			result = "Weird";
		}else{
			if(6<=num && num<=20) {
				result = "Weird";
			}else {
				result = "Not Weird";
			}
		}
		
		System.out.println(result);
	}
}