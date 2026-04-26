import java.util.Scanner;

public class A_2222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean ok = false;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] == 100){
                ok = true;
            }
        }   
        System.out.println(ok ? "YES" : "NO");
    }
}
