import java.util.Arrays;
import java.util.Scanner;

public class C_977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        if(k == 0){
            if(a[0] == 1){
                System.out.println(-1);
            }
            else{
                System.out.println(1);
            }
        }
        else if((k == n)){
            System.out.println(a[n - 1]);
        }
        else{
            if(a[k - 1] == a[k]){
                System.out.println(-1);
            }
            else{
                System.out.println(a[k - 1]);
            }
        }
    }
}
