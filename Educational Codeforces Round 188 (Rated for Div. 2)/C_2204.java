import java.util.Scanner;

public class C_2204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long m = sc.nextLong();
        long A = m/a;
        long B = m/b;
        long C = m/c;
        long ab = m/lcm(a,b);
        long ac = m/lcm(a,c);
        long bc = m/lcm(b,c);
        long abc = m/lcm(lcm(a,b),c);
        long onA = A - ab - ac + abc;
        long onB = B - ab - bc + abc;
        long onC = C - ac - bc + abc;
        long AB = ab - abc;
        long AC = ac - abc;
        long BC = bc - abc;
        System.out.println((6 * onA + 3 * AB + 3 * AC + 2 * abc) + " " + (6 * onB + 3 * AB + 3 * BC + 2 * abc) + " " + (6 * onC + 3 * AC + 3 * BC + 2 * abc));
    }


    private static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    private static long lcm(long a, long b){
        return a / gcd(a,b) * b;
    }

}
