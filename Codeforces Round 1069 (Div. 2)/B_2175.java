import java.util.Scanner;

public class B_2175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int pre = 0;
        int target = l - 1;
        for (int i = 1; i <= n; i++) {
            int cur = i;
            if (i == r) {
                cur = target; 
            }
            int val = pre ^ cur;
            System.out.print(val + " ");
            pre = cur;
        }
    }
}
