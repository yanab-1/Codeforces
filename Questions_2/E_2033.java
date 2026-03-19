import java.util.Scanner;

public class E_2033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        for(int i = 1; i <= n; i++){
            p[i] = sc.nextInt();
        }
        int ans = 0;
        int[] vis = new int[n + 1];
        for(int i = 1; i <= n; i++){
            if(vis[i] == 0){
                int c = 0;
                int cu = i;
                while(vis[cu] == 0){
                    c++;
                    vis[cu] = 1;
                    cu = p[cu];
                }
                ans += (c - 1) / 2;
            }
        }
        System.out.println(ans);
    }
}
