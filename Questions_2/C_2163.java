import java.util.Scanner;

public class C_2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[][] a = new int[2][n];
        for(int i = 0; i < n; i++){
            a[1][i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            a[2][i] = sc.nextInt();
        }
        
    }
}
