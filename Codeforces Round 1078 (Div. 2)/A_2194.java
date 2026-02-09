import java.util.Scanner;

public class A_2194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int w = sc.nextInt();
        System.out.println(n - n / w);
    }
}
