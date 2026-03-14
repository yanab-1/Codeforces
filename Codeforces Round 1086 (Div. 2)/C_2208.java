import java.util.Scanner;

public class C_2208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        double[] dp = new double[n + 1];
        for(int i = n - 1; i >= 0; i--){
            double skip = dp[i + 1];
            double d = 1 - arr[i][1] / 100.0;
            double gain = arr[i][0] + d * dp[i + 1];
            dp[i] = Math.max(skip, gain);
        }
        System.out.println(dp[0]);
    }

    // private static double solve1(int[][] arr, int i, double s){
    //     if(i == arr.length) return 0;
    //     double skip = solve1(arr, i + 1, s);
    //     double gain = s * arr[i][0];
    //     double n = s * (1 - arr[i][1] / 100.0);
    //     double take = gain + solve1(arr, i + 1, n);

    //     return Math.max(skip, take);
    // }
}
