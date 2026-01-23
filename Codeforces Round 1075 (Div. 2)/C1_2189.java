import java.util.Scanner;

public class C1_2189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] p = new int[n]; 
        p[n - 1] = 1;
        for (int i = 1; i <= n - 2; i++) {
            p[i] = (i + 1) ^ 1;
        }
        p[0] = (n % 2 == 0 ? n : n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
    }
}
