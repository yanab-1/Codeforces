import java.util.Scanner;

public class A_2171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(n % 2 == 1){
            System.out.println(0);
            return;
        }
        System.out.println((n / 2) / 2 + 1);
    }
}
