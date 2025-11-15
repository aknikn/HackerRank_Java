import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        //"\s" is a space
        int count = 0;
        String[] array = s.split("[\\s!,?._'@]");
        ArrayList<String> resultArray = new ArrayList<String>();
        for(String str: array){
            if(!str.isEmpty()){
                count++;
                resultArray.add(str);
            }
        }
        
        System.out.println(count);
        for(String ra: resultArray){
            System.out.println(ra);
        }
    }
}

