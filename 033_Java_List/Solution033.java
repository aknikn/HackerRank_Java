import java.util.*;

public class Solution033 {
    public static void main(String[] args) {
        /*
         * Enter your code here.
         * Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         */
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         sc.nextLine();
         String[] strArr = sc.nextLine().split(" ");
         List<Integer> arr = new ArrayList<>();
         for(String str:strArr){
            arr.add(Integer.parseInt(str));
         }
         
         int Q = sc.nextInt();
         sc.nextLine();
         
         for(int i=0; i<Q; i++){
             String command = sc.nextLine();
             String index = sc.nextLine();
            
             int idx = 0;
             switch(command){
             case "Insert":
                 String[] tmpArr = index.split(" ");
                 idx = Integer.parseInt(tmpArr[0]);
                 int num = Integer.parseInt(tmpArr[1]);
                 arr.add(idx, num);
                 break;
             case "Delete":
                 idx = Integer.parseInt(index);
                 arr.remove(idx);
                 break;
             }
         }
         sc.close();
         
         String result = "";
         for(int i=0; i<arr.size(); i++){
            if(i==arr.size()-1){
                result += arr.get(i);
            }else{
                result += arr.get(i)+" ";
            }
         }
         System.out.println(result);
    }
}