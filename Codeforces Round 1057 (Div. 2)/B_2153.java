import java.util.Scanner;

public class B_2153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
         if((x&y) == (y&z) && (y&z) == (x&z))
                System.out.println("YES");
            else
                System.out.println("NO");

    }
}
