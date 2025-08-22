
import java.util.Scanner;

public class B_1826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n= sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n/2;i++){
            ans=gcd(ans,Math.abs(a[i]-a[n-i-1]));
        }
        System.out.println(ans);
    }

    private static int gcd(int ans, int abs) {
        if(abs==0){
            return ans;
        }
        return gcd(abs,ans%abs);
    }

}
