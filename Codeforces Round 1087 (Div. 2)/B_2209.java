import java.util.Scanner;

public class B_2209 {
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
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) l++;
                else if (a[j] > a[i]) 
                    r++;
            }
            ans[i] = Math.max(l, r);
        } 
        for(int i : ans){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
