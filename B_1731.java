import java.util.Scanner;

public class B_1731 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    
    private static void solve(Scanner sc) {
        long mod=1000000007;
        long n=sc.nextLong();
        long ans=((((n*(n+1))%mod)*(4*n-1))%mod*337)%mod;
        System.out.println(ans);
    }
}
