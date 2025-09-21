import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class D1_2146 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int l = sc.nextInt();
        int r = sc.nextInt(); 
        int n = r - l + 1;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>(Collections.nCopies(n,0));
        long sum = 0;
        for(int x = r; x >= l; x--){
            if(map.containsKey(x)) continue;
            int p = Integer.highestOneBit(x) << 1;
            int y = p - 1 - x;
            if(y < l || y > r || map.containsKey(y)){
                ans.set(x - l, x);
                map.put(x, x);
                sum += x;
            }
            else{
                ans.set(x - l, y);
                ans.set(y - l, x);
                map.put(x, y);
                map.put(y, x);
                sum += 2L * (x | y);
            }
        }
        System.out.println(sum);
        for(int v : ans){
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
