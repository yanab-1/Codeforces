import java.util.Scanner;

public class C_2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            solve(sc);
        }
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (gcd(n, a) == 1 && gcd(m, b) == 1 && gcd(n, m) <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
