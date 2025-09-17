import java.util.Arrays;
import java.util.Scanner;

public class B_2143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        reverse(a);
        Arrays.sort(b);
        long ans = 0;
        for(int i = 0; i < n; i++) {
            ans += a[i];
        }
        int i = 0;
        for(int j : b){
            if(i + j - 1 >= n){
                break;
            }
            i += j - 1;
            ans -= a[i];
            i++; 
        } 
        System.out.println(ans);
    }
    private static void reverse(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
    }
}
