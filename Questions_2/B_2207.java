import java.util.Arrays;
import java.util.Scanner;

public class B_2207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        int curr = n;
        for (int i = 0; i < l; i++) {
            int idx = Math.min(m, curr + 1) - 1;
            b[idx]++;
            Arrays.sort(b);
            reverse(b);
            if (curr > 0 && a[n - curr] - 1 == i) {
                b[0] = 0;
                Arrays.sort(b);
                reverse(b);           
                curr--;
            }
        }
        System.out.println(b[0]);
    }

    private static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
