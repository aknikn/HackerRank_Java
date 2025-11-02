import java.util.*;
import java.io.*;

class Solution007 {
    public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		for(int i=0; i<num; i++) {
			String result = "";
			
			int baseNum = sc.nextInt(); // The number being added at first
			int multNum = sc.nextInt(); // The number being multipled
			int timeNum = sc.nextInt(); // The number being factored
			
			int tmp = baseNum;
			for(int j=0; j<timeNum; j++) {
				tmp += multNum*Math.pow(2, j);
				result += tmp;
				
				if(j<timeNum-1) {
					result += " ";
				}else {
					System.out.println(result);
				}
			}
		}
		sc.close();
    }
}
