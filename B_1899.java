
import java.util.Scanner;

public class B_1899 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            print(a);
        }
    }

    private static void print(int[] a) {
        long ans=0;
        int n=a.length;
        for(int k=1;k<=n;k++){
            if(n%k==0){
                long min=Long.MAX_VALUE; 
                long max=Long.MIN_VALUE;
                for(int i=0;i<n;i+=k){
                    long sum=0;
                    for(int j=i;j<i+k;j++){
                        sum+=a[j];
                    }
                    min=Math.min(min,sum);
                    max=Math.max(max,sum);
                }
                ans=Math.max(ans,max-min);
            }
        }
        System.out.println(ans);
    }
}
