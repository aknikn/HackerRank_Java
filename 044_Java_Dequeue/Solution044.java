import java.util.*;
public class Solution044{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int max = 0;

        for (int i=0; i<N; i++){
            int num = sc.nextInt();            
            deque.addLast(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (deque.size() == M){
                if(max<map.size()) max = map.size();

                int first = deque.pollFirst();
                int count = map.get(first);
                
                if (count == 1) {
                    map.remove(first);
                } else {
                    map.put(first, count - 1);
                }
            }
            if (max==M) break;
        }
        sc.close();
        System.out.println(max);
    }
}