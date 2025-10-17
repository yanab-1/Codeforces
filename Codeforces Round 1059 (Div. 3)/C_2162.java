import java.util.Scanner;

public class C_2162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println(0);
            return;
        }
        int ma = highest(a);
        int mb = highest(b);
        if(ma < mb){
            System.out.println(-1);
            return;
        }
        if(ma == mb){
            System.out.println(1);
            System.out.println(a ^ b);
            return;
        }
        int inter = a | b;
        int x1 = a ^ inter;
        int x2 = b ^ inter;
        System.out.println(2);
        System.out.println(x1 + " " + x2);
    }

    private static int highest(int n) {
        if(n == 0) return 0;
        n |= (n >> 1);
        n |= (n >> 2);
        n |= (n >> 4);
        n |= (n >> 8);
        n |= (n >> 16);
        return n - (n >>> 1);
    }
}
