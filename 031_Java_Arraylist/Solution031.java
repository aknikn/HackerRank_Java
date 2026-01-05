import java.io.*;
import java.util.*;

public class Solution031 {
    public static void main(String[] args) {
        /*
         * Enter your code here.
         * Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         */
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         sc.nextLine();
         List<List<Integer>> arr = new ArrayList<>();         
         for(int i=0; i<n; i++){
            arr.add(new ArrayList<>());
            String[] strArr = sc.nextLine().split(" ");
            for(int j=0; j<strArr.length; j++){
                arr.get(i).add(Integer.parseInt(strArr[j]));
            }
         }
         
         int q = sc.nextInt();
         sc.nextLine();
         List<List<Integer>> xyArr = new ArrayList<>();         
         for(int i=0; i<q; i++){
            xyArr.add(new ArrayList<>());
            String[] qArr = sc.nextLine().split(" ");
            for(int j=0; j<qArr.length; j++){
                xyArr.get(i).add(Integer.parseInt(qArr[j]));
            }
         }
         sc.close();
         
         for(int i=0; i<q; i++){
            try{            
                int row = xyArr.get(i).get(0)-1;
                int index = xyArr.get(i).get(1);
                System.out.println(arr.get(row).get(index));
            }catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
                continue;
            }
         }
    }
}