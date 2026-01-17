import java.util.Arrays;
import java.util.Scanner;

public class A_1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = 2 * sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        if(a[0] == a[n - 1]){
            System.out.println(-1);
            return;
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
