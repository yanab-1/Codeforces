import java.util.Scanner;

public class E_1790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long x = sc.nextLong();
        if(x % 2 == 1) {
            System.out.println(-1);
            return;
        }
        long a = (3 * x) / 2;
        long b = x / 2;
        if((a ^ b) == x){
            System.out.println(a + " " + b);
        }
        else{
            System.out.println(-1);
        }
    }

}
