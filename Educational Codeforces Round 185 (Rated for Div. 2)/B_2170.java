import java.util.Scanner;

public class B_2170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long sum = 0;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum += x;
            if (x == 0) zeros++;
        }

        long zero = n - zeros;
        long s = sum - n + 1;

        long ans;
        if (zero < s) ans = zero;
        else ans = s;

        System.out.println(ans);
    }
}
