import java.util.Scanner;

public class C_1923 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] cnt = new int[n + 1];
        long[] prefix = new long[n + 1];
        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            prefix[i] = prefix[i - 1] + x;
            cnt[i] = cnt[i - 1] + (x == 1 ? 1 : 0);
        }
        while (q-- > 0) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt();
            long sum = prefix[r] - prefix[l];
            long count = cnt[r] - cnt[l];
            if((r - l + count) <= sum && r - l > 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
