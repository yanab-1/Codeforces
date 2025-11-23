import java.util.Scanner;

public class B_2157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long x = sc.nextLong(); 
        long y = sc.nextLong();
        String s = sc.next();
        long c = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '8') c++;
        }
        long ax = Math.abs(x);
        long ay = Math.abs(y);
        long d = Math.min(Math.min(ax, ay), c);
        long need = ax + ay - d;

        System.out.println(need <= n ? "YES" : "NO");


    }
}
