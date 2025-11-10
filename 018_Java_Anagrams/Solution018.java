import java.util.Scanner;

public class Solution018 {
    static boolean isAnagram(String a, String b) {
        // Complete the function below
        
        // Compare A and B by string length
        if(a.length()!=b.length()){
            return false;
        }
        
        String[] aArray = sortArray(a.toLowerCase());        
        String[] bArray = sortArray(b.toLowerCase());
        
        for(int i=0; i<aArray.length; i++){
            if(!aArray[i].equalsIgnoreCase(bArray[i])){
                return false;
            }
        }
        return true;
    }
    
    // Sort the characters in the string
    // (also all characters are returned in lower case)
    static String[] sortArray(String str){
        String[] result = str.split("");
        
        for(int i=0; i<result.length; i++){
            for(int j=result.length-1; i<j; j--){
                if(result[j].compareTo(result[i])<0){
                	String tmp = result[j];
                    result[j] = result[i];
                    result[i] = tmp;
                }
            }
        }
        return result;
    }

	// Complete the function above
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}