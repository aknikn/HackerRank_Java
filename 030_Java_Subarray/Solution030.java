import java.util.*;

public class Solution030 {
    public static void main(String[] args) {
        /* Enter your code here.
           Read input from STDIN.
           Print output to STDOUT.
           Your cl ass should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        sc.close();
        int[] arr = new int[n];
        for(int j=0; j<n; j++){
            arr[j] = Integer.parseInt(str[j]);
        }
        
        int count = 0;
        for(int sum=1; sum<=n; sum++){
            if(sum==n){
                count += ifMinus(Arrays.stream(arr).sum());
            }else{
                for(int i=0; i<n; i++){
                    if(n<i+sum){
                        break;
                    }else{
                        int[] sub = Arrays.copyOfRange(arr, i, i+sum);
                        count += ifMinus(Arrays.stream(sub).sum());
                    }
                }
            }   
        }
        System.out.println(count);
    }
    
    public static int ifMinus(int sum){
        int result = 0;
        if(sum<0){
            result = 1;
        }else{
            result = 0;
        }
        return result;
    }
}