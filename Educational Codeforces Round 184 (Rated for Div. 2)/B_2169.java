import java.util.Scanner;

public class B_2169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        String s = sc.next();
        if(s.indexOf("**") != -1 || s.indexOf(">*") != -1 || s.indexOf("><") != -1 || s.indexOf("*<") != -1) {
            System.out.println(-1);
            return;
        }
        int n = s.length();
        int prefix = 0;
        while (prefix < n && (s.charAt(prefix) == '<' || s.charAt(prefix) == '*')) prefix++;

        int suffix = 0;
        while (suffix < n && (s.charAt(n - 1 - suffix) == '>' || s.charAt(n - 1 - suffix) == '*')) suffix++;

        System.out.println(Math.max(prefix, suffix));
    }
}
