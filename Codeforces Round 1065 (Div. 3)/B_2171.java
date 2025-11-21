import java.util.Scanner;

public class B_2171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        boolean x = a[0] != -1;
        boolean y = a[n - 1] != -1;

        if (!x && !y) {
            a[0] = 0;
            a[n - 1] = 0;
        } else if (x && !y) {
            a[n - 1] = a[0];
        } else if (!x && y) {
            a[0] = a[n - 1];
        }

        int v = Math.abs(a[n - 1] - a[0]);

        for (int i = 1; i < n - 1; i++) {
            if (a[i] == -1) a[i] = 0;
        }
        System.out.println(v);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
