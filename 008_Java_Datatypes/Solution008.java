import java.util.*;
// import java.io.*;

class Solution {
    public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			try {
				long number = sc.nextLong();
				System.out.println(number+" can be fitted in:");
				
				// byte
				if(-128<=number && number<=127) {
					System.out.println("* byte");
				}
				
				// short
				if(Short.MIN_VALUE<=number && number<=Short.MAX_VALUE) {
					System.out.println("* short");
				}
				
				// int
				if(Integer.MIN_VALUE<=number && number<=Integer.MAX_VALUE) {
					System.out.println("* int");
				}
				
				// long
				if(Long.MIN_VALUE<=number && number<=Long.MAX_VALUE) {
					System.out.println("* long");
				}
				
			}catch(Exception e) {
				System.out.println(sc.next()+" can't be fitted anywhere.");
			}
		}
		sc.close();
    }
}