import java.util.Arrays;
import java.util.Scanner;

public class D_2111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        for(int i = 0; i < m ;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[][] ans = new int[n][6];
        for(int i = 0; i < n; i += 2){
            if(i + 1 == n){
                for(int j = 0; j < 6; j++){
                    if(j % 2 == 0){
                        ans[i][j] = a[i / 2];
                    }else{
                        ans[i][j] = a[m - i / 2 - 1];
                    }
                }
            }
            else{
                for(int j = 0; j < 6; j++){
                    if(j % 2 == 0){
                        ans[i][j] = a[i / 2];
                        ans[i + 1][j] = a[m - i / 2 - 1];
                    }else{
                        ans[i][j] = a[m - i / 2 - 1];
                        ans[i + 1][j] = a[i / 2];
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
