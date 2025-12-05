import java.util.Scanner;

public class A_2173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int last = -1; 
        int awake = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                int start = i;
                int end = Math.min(n - 1, i + k);
                if (start > last) { 
                    awake += (end - start + 1);
                    last = end;
                } else if (end > last) { 
                    awake += (end - last);
                    last = end;
                }
            }
        }
        System.out.println(n - awake);
    }
}
