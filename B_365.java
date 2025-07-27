import java.util.Scanner;

public class B_365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        if(n<3){
            System.out.println(n);
            return;
        }
        int ans=0;
        int c=2;
        int i=2;
        while(i<n){
            if(a[i-1]+a[i-2]==a[i]){
                c++;
            }
            else {
                ans = Math.max(ans, c);
                c = 2;
            }
            i++;
        }
        ans = Math.max(ans, c);
        System.out.println(ans);
    }
}