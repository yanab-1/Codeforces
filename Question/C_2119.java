import java.util.Scanner;

public class C_2119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }
    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long l = sc.nextLong();
        long r = sc.nextLong();
        long k = sc.nextLong();
        if(n == 2){
            System.out.println(-1);
            return;
        }
        if(n % 2 == 1){
            System.out.println(l);
        }
        else{
            long first = power(l,r);
            if(first == -1) {
                System.out.println(-1);
                return;
            }
            if(k > n-2){
                System.out.println(first);
            }
            else{
                System.out.println(l);
            }
        }
    }
    private static long power(long l, long r) {
        long res = 1;
        while(res <= r){
            if(res > l) return res;
            res *= 2;
        }
        return -1;
    }
}
