import java.util.*;

public class A_2128 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long c = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        int s=0;
        int p=1;
        int ans=n;
        for(int i=n-1;i>=0;i--){
            if(p*a[i]<=c){
                s++;
                p*=2;
            }
        }
        System.out.println(ans-s);
    }
}
