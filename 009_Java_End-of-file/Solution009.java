// import java.io.*;
import java.util.*;

public class Solution009 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		while(sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println(num+" "+str);
			num++;
		}
		sc.close();
    }
}