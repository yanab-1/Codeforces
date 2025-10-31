import java.util.Scanner;

public class A_2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long r = sc.nextLong();
        long x = sc.nextLong();
        long d = sc.nextLong();
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        for(char c : s.toCharArray()) {
            if(c == '1'){
                r = Math.max(0L, r - d);
                ans++;
            }
            else if(c == '2'){
                if(r < x){
                    r = Math.max(0L, r - d);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
