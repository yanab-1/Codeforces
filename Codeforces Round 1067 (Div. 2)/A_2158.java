import java.util.Scanner;

public class A_2158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(Math.min(n, r + y / 2));
    }
}
