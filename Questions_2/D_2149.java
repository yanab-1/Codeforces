import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_2149 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        long ans = Long.MAX_VALUE;
        for(char c : new char[]{'a', 'b'}){
            List<Integer> idx = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == c){
                    idx.add(i);
                }
            }
            if(idx.size() == 0) continue;
            int mid = idx.get(idx.size() / 2);
            long res = 0;
            for(int i = 0 ; i < idx.size() ; i++){
                res += Math.abs(mid + i - idx.size() / 2 - idx.get(i));
            }
            ans = Math.min(ans, res);
        }
        System.out.println(ans);
    }
}
