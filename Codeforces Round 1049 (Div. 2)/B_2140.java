import java.util.Scanner;

public class B_2140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int x = sc.nextInt();
        System.out.println((long) 8 * x);
    }
}
