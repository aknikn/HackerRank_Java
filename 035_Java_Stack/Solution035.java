import java.util.*;
class Solution035{
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input = sc.next();
            //Complete the code
            System.out.println(isBalanced(input));
		}
		sc.close();
	}
    
    public static boolean isBalanced(String str){
        if(str.length()%2 != 0){
            return false;
        }
        
        if(str.substring(0, 1).equals("}")||str.substring(0, 1).equals(")")||str.substring(0, 1).equals("]")){
            return false;
        }
        
        String[] strArr = str.split("");
        Deque<String> stack = new ArrayDeque<>();
        for(String s: strArr){
            if(s.equals("{")||s.equals("(")||s.equals("[")){
                stack.push(s);
            }else{
                String opener = "";
                switch(s){
                    case "}":
                        opener = "{";
                        break;
                    case ")":
                        opener = "(";
                        break;
                    case "]":
                        opener = "[";
                        break;
                }
                
                if(stack.isEmpty()||!stack.peek().equals(opener)){
                    return false;
                }else{
                    stack.pop();
                }
                
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}