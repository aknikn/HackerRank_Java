import java.util.*;

public class Solution032 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game;
        // otherwise, return false.
        return dfs(0, leap, game);
    }
    
    public static boolean dfs(int i, int leap, int[] game){
        // out of indexes or index = 1
        if(i<0 || game[i]==1){
            return false;
        }
        
        // reach end of index or leap out of index
        if(i==game.length-1 || game.length<=i+leap){
            return true;
        }
        
        // flag already traversed
        game[i] = 1;
        
        // traverse moving forward, backward and leaping
        return dfs(i+1, leap, game) ||
               dfs(i-1, leap, game) ||
               dfs(i+leap, leap, game);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}