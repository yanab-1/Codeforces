import java.util.Scanner;

public class B_2154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] maxPrefix = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(i == 0){
                maxPrefix[i] = arr[i];
            } else {
                maxPrefix[i] = Math.max(maxPrefix[i - 1], arr[i]);
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if ((i % 2) == 0) { 
                long limit;
                if (i == 0) {
                    limit = maxPrefix[1] - 1;
                } else if (i == n - 1) {
                    limit = maxPrefix[n - 2] - 1;
                } else {
                    limit = Math.min(maxPrefix[i - 1], maxPrefix[i + 1]) - 1;
                }
                if (limit < 0) limit = 0; 
                if (arr[i] > limit) ans += (arr[i] - limit);
            }
        }
        System.out.println(ans);
    }
}
