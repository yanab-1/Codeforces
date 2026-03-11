import java.util.ArrayList;
import java.util.Scanner;

public class C_2120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long maxLimit = (n * (n + 1)) / 2;
        if(n <= m && m <= maxLimit){
            if(n == m){
                System.out.println(1);
                for(long i = 1; i < n; i++){
                    System.out.println(i + " " + (i + 1));
                }
            }
            else if(n == maxLimit){
                System.out.println(n);
                for(long i = n; i > 0; i--){
                    System.out.println(i + " " + (i - 1));
                }
            }
            else{
                long need = m - n;
                ArrayList<Long> ans = new ArrayList<>();
                long cur = 0;
                boolean[] visit = new boolean[(int) (n + 1)];
                for(long i = n - 1; i >= 0; i--){
                    if(cur == need) break;
                    if(cur + i <= need){
                        ans.add(i + 1);
                        cur += i;
                        visit[(int) (i + 1)] = true;
                    }
                }
                if(ans.size() < n){
                    ans.add(1L);
                    visit[1] = true;
                    for(long i = 2; i <= n; i++){
                        if(!visit[(int) i]){
                            ans.add(i);
                        }
                    }
                }
                System.out.println(ans.get(0));
                for(int i = 1; i < ans.size(); i++){
                    System.out.println(ans.get(i - 1) + " " + ans.get(i));
                }
            }
        }
        else{
            System.out.println(-1);
        }
    }
}
