import java.util.Scanner;

public class C_2137 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k;
        if(b % 2 == 0){
            k = b / 2;
            long ans = a * k + 2;
            if (ans % 2 == 0) {
                System.out.println(ans);
            } else {
                System.out.println(-1);
            }
            return;
        }
        if(a % 2 == 0){
            System.out.println(-1);
            return;
        }
        System.out.println(a * b + 1);
    }
}
