import java.util.Scanner;

public class B_2166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long ans = 0;
        if(n <= a / b){
            ans = 1;
        }
        else{
            if(a == b){
                ans = 1;
            }
            else{
                ans = 2;
            }
        }
        System.out.println(ans);
    }
}
