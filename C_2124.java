import java.util.Scanner;

public class C_2124 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        long[] b=new long[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextLong();
        }
        long ans=1;
        for (int i=0;i+1<n;i++) {
            if(b[i+1]%b[i]!=0) {
                long g=gcd(b[i],b[i+1]);
                long lcm=b[i]/g;
                long d=gcd(ans,lcm);
                ans=(ans/d)*lcm;
            }
        }
        System.out.println(ans);
        }
        private static long gcd(long a, long b) {
            while (b != 0) {
                long t = b;
                b = a % b;
                a = t;
            }
            return a;
        }
        
}
