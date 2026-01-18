import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
	
	// Write my code below.
	PerformOperation isOdd(){
		return num -> num % 2 !=0;
	}
	
	PerformOperation isPrime(){
		return num -> {
			for(int i=2; i<num; i++){
				if(num % i == 0){
					return false;
				}
			}
			return true;
		};
	}
	
	PerformOperation isPalindrome(){
		return  num -> {
			int x = 0;
			int y = num;
			while(0<num){
				x = x*10 + num%10;
				num = num/10;
			}
			if(x==y){
				return true;
			}else{
				return false;
			}
		};
	}
}
// Write my code above.

public class Solution043 {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		
		while (T--> 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
			
			}
			System.out.println(ans);
		}
	}
}
