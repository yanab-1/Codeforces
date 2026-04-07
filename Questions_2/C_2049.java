import java.util.Scanner;

public class C_2049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[(x + i) % n] = i % 2;
        }
        if(n % 2 == 1 || (x - y) % 2 == 0){
            ans[x] = 2;
        }
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
