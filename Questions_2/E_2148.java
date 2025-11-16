import java.util.Scanner;

public class E_2148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] freq = new int[n + 1];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            freq[a[i]]++;
        }
        for(int i = 1; i <= n; i++){
            if(freq[i] > 0 && freq[i] % k != 0){
                System.out.println(0);
                return;
            }
            freq[i] /= k;
        }
        int l = 0;
        long ans = 0;
        int[] count = new int[n + 1];
        for(int r = 0; r < n; r++){
            count[a[r]]++;
            while(l <= r && count[a[r]] > freq[a[r]]){
                count[a[l]]--;
                l++;
            }
            ans += r - l + 1;
        }
        System.out.println(ans);
    }
}
