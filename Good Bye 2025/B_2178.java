import java.util.Scanner;

public class B_2178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        String r = sc.next();
        int n = r.length();
        int a = (r.charAt(0) == 'u') ? 1 : 0;
        int b = a + ((r.charAt(1) == 'u') ? 1 : 0);

        for (int i = 2; i < n; i++) {
            int c = (r.charAt(i) == 'u' ? 1 : 0) + Math.min(a, b);
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
