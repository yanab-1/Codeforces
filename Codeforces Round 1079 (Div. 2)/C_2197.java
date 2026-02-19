import java.util.Scanner;

public class C_2197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long p = sc.nextLong();
        long q = sc.nextLong();
        if (q > p && 3L * p >= 2L * q) System.out.println("Bob");
        else System.out.println("Alice");
    }
}
