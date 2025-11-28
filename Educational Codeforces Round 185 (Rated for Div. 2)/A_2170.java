import java.util.Scanner;

public class A_2170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(9);
        } else if (n == 3) {
            System.out.println(29);
        } else if (n == 4) {
            System.out.println(56);
        } else {
            long result = 5 * n * n - 5 * n - 5;
            System.out.println(result);
        }
    }
}
