import java.util.Scanner;

public class B_1780 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int[] a=new int[n];
        long sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        long pref=0;
        long ans=0;
        for(int i=n-1;i>0;i--){
            pref+=a[i];
            ans=Math.max(ans,gcd(pref,sum-pref));
        }
        System.out.println(ans);
    }
    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
