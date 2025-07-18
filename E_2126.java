import java.util.Scanner;

public class E_2126 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        long[] p=new long[n];
        long[] s=new long[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            s[i]=sc.nextLong();
        }
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=lcm(p[i],s[i]);
        }
        long x=0;
        for(int i=0;i<n;i++){
            x=gcd(x,a[i]);
            if(x!=p[i]){
                System.out.println("no");
                return;
            }
        }
        x=0;
        for(int i=n-1;i>=0;i--){
            x=gcd(x,a[i]);
            if(x!=s[i]){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }

    private static long lcm(long l, long l0) {
        return (l*l0)/gcd(l,l0);
    }

    private static long gcd(long l, long l0) {
        while(l0!=0){
            long rem=l%l0;
            l=l0;
            l0=rem;
        }
        return l;
    }
}
