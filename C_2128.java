import java.util.Scanner;

public class C_2128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>2*min){
                System.out.println("YES");
                return;
            }
            min=Math.min(min, arr[i]);
        }
        System.out.println("NO");
    }
}
