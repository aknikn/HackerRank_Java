import java.io.*;
import java.util.Scanner;

public class Solution006 {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
    }
}