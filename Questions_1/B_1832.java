import java.util.Arrays;
import java.util.Scanner;

public class B_1832 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            print(arr,n,k);
        }
    }

    private static void print(int[] arr, int n, int k) {
        Arrays.sort(arr);
        long[] pre=new long[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++) {
            pre[i]=pre[i-1]+arr[i];
        }
        long ans=0;
        for(int i=0;i<=k;i++){
            int j=k-i;
            int l=2*i;
            int r=n-1-j;
            if(l>r) continue;
            long sum=pre[r]-(l==0 ? 0 : pre[l-1]);
            ans=Math.max(ans, sum);
        }
        System.out.println(ans);
    }
    
}
