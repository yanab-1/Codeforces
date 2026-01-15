import java.util.Scanner;

public class B_2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        long h = 0;
        long max = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            h += a[i];
            max = Math.max(max, a[i]);
        }
        long cus = (h + x - 1) / x;
        System.out.println(Math.max(cus, max));
    }
}
