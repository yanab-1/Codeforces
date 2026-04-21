import java.util.Scanner;

public class A_2225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        long x = sc.nextLong();
        long y = sc.nextLong();
        if(y / x > 2) System.out.println("YES");
        else System.out.println("NO"); 
    }
}
