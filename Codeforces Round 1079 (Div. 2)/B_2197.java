import java.util.Scanner;

public class B_2197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            p[x] = i;
        }
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                if (p[a[i]] < p[a[i - 1]]) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

}
