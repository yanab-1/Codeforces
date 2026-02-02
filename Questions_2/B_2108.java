import java.util.Scanner;

public class B_2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        if(x == 0){
            if(n % 2 == 0){
                System.out.println(n);
                return;
            }
            else if(n == 1){
                System.out.println(-1);
                return;
            }
            else{
                System.out.println(n + 3);
                return;
            }
        }
        int c = countBits(x);
        if(n <= c){
            System.out.println(x);
            return;
        }
        int ans = n - c + x;
        if((n - c) % 2 == 0){
            System.out.println(ans);
            return;
        }
        else{
            if(x == 1){
                System.out.println(ans + 3);
                return;
            }
            System.out.println(ans + 1);
            return;
        }
    }

    private static int countBits(int n){
        int c = 0;
        while(n > 0){
            if((n & 1) == 1){
                c++;
            }
            n >>= 1;
        }
        return c;
    }
}
