import java.util.Scanner;

public class C_2118{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();   
        long k = sc.nextLong();
        int[] a = new int[n];
        long ans = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            ans += Long.bitCount(a[i]);
        }
        for(int i=0; i<=60; i++){
            long b = 1L << i;
            for(int num : a){
                if((num & b) == 0 && k >= b){
                    k -= b;
                    ans++;
                }
            } 
        }
        System.out.println(ans);
    }
}