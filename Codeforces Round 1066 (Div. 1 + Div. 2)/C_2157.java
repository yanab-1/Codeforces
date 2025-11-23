
import java.util.Scanner;

public class C_2157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        int q = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 1; i <= q; i++){
            int c = sc.nextInt();
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            if(c == 1){
                for(int j = l; j <= r; j++){
                    a[j] = k;
                }
            }
            if(c == 2){
                for(int j = l; j <= r; j++){
                    b[j] = 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(a[i] == k && b[i] == 1){
                a[i] = k + 1;
            }
            else if(b[i] == 1){
                a[i] = i % k;
            }
        }
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
