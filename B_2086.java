
import java.util.Scanner;

public class B_2086 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long x = sc.nextLong();
            long totalSum = 0;
            long[] arr = new long[n];
            long[] pre = new long[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                totalSum += arr[i];
            }
            long limit = k * totalSum - x;
            if (limit < 0) {
                System.out.println(0);
                continue;
            }
            for (int i = 1; i <= n; i++) {
                pre[i] = pre[i - 1] + arr[i - 1];
            }
            long res = 0;
            for (int r = 0; r < n; r++) {
                if (pre[r] <= limit) {
                    res += Math.min(k, (limit - pre[r]) / totalSum + 1);
                }
            }
            System.out.println(res);
        }
    }
}
