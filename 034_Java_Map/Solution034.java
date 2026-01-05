//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution034{
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
        
		for(int i=0; i<n; i++){
			String name = sc.nextLine();
			int phone = sc.nextInt();
			sc.nextLine();
            phoneBook.put(name, phone);
		}
        
		while(sc.hasNext())
		{
			String str =sc.nextLine();
            if(phoneBook.get(str)!=null){
                System.out.println(str+"="+phoneBook.get(str));
            }else{
                System.out.println("Not found");
            }
		}
        sc.close();
	}
}