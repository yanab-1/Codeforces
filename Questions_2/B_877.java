import java.util.Scanner;

public class B_877 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        String s = sc.next();
        int n = s.length();
        int[] prefa = new int[n + 1];
        int[] prefb = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefa[i] = prefa[i - 1];
            prefb[i] = prefb[i - 1];
            if (s.charAt(i - 1) == 'a') prefa[i]++;
            else if (s.charAt(i - 1) == 'b') prefb[i]++;
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int left = prefa[i];                  
                int middle = prefb[j] - prefb[i];    
                int right = prefa[n] - prefa[j];      
                int len = left + middle + right;
                ans = Math.max(ans, len);
            }
        }

        System.out.println(ans);
    }
}
