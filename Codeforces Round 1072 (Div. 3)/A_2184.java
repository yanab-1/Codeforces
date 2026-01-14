import java.util.Scanner;

public class A_2184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(n <= 3){
            System.out.println(n);
            return;
        }
        System.out.println(n % 2);
    }
}
