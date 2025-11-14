import java.util.Arrays;
import java.util.Scanner;

public class A_2169 {
    static final long MAXB = 2000000000L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int x = 0;
        int y = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > a) x++;
            else if(arr[i] < a) y++;
        }
        int b  = 0;
        if(x >= y ) b = a + 1;
        else b = a - 1;
        System.out.println(b);
    }
}
