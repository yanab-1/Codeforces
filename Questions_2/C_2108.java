import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> ll = new ArrayList<>();
        ll.add(0);
        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            if(ll.get(ll.size() - 1) != x){
                ll.add(x);
            }
        }
        int ans = 0;
        ll.add(0);
        for(int i = 1; i <= ll.size() - 1; i++){
            if(ll.get(i - 1) < ll.get(i) && ll.get(i) > ll.get(i + 1)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
