import java.util.Scanner;

public class A_1893 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        int cur = n - 1;
        for(int i = 0; i < Math.min(n, k); i++){
            if(b[cur] > n){
                System.out.println("No");
                return;
            }
            cur += n - b[cur];
            if(cur >= n) cur -= n;
        }
        System.out.println("Yes");
    }
}
