import java.util.Arrays;
import java.util.Scanner;

public class A_2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 1; i < n - 1; i+=2){
            if(a[i] != a[i + 1]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
