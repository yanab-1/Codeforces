import java.util.Scanner;

public class B_2134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }
    private static void solve(Scanner sc){
        int n = sc.nextInt();
        long k = sc.nextLong(); 
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        for(int i=0; i<n; i++){
            a[i] += (a[i] % (k + 1)) * k;  
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // private static void solve(Scanner sc) {
    //     int n = sc.nextInt();
    //     long k = sc.nextLong(); 
    //     long[] arr = new long[n];
    //     for(int i = 0; i < n; i++){
    //         arr[i] = sc.nextLong();
    //     }
    //     if(k % 2 == 1){
    //         for(int i = 0; i < n; i++){
    //             if(arr[i] % 2 != 0){
    //                 arr[i]+=k;
    //             }
    //         }
    //     }
    //     else{
    //         long p = spf(k+1);
    //         long inv = modpower(k % p, p - 2, p);
    //         for (int i = 0; i < n; i++) {
    //             long s = (p - (arr[i] % p)) % p;
    //             long x = (s * inv) % p;
    //             arr[i] += x * k;
    //         }
    //     }
    //     for(int i = 0; i < n; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();

    // }
    // private static long modpower(long base, long exp, long mod) {
    //     long result = 1;
    //     base = base % mod;
    //     while (exp > 0) {
    //         if ((exp & 1) == 1) {
    //             result = (result * base) % mod;
    //         }
    //         exp = exp >> 1;
    //         base = (base * base) % mod;
    //     }
    //     return result;
    // }
    // private static long spf(long n) {
    //     if(n % 2 == 0) return 2;
    //     for (long i = 3; i * i <= n; i += 2) {
    //         if (n % i == 0) {
    //             return i;
    //         }
    //     }
    //     return n;
    // }
}
