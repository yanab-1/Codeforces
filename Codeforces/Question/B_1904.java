import java.util.Arrays;
import java.util.Scanner;

public class B_1904{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[][] a=new long[n][2];
            for(int i=0;i<n;i++) {
                a[i][0]=sc.nextLong();
                a[i][1]=i;
            }
            print(a,n);
        }
    }

    private static void print(long[][] a, int n) {
        Arrays.sort(a, (x, y) -> Long.compare(x[0], y[0]));
        long[] pre=new long[n];
        pre[0]=a[0][0];
        for(int i=1;i<n;i++) {
            pre[i]=pre[i-1]+a[i][0];
        }
        long[] ans= new long[n];
        for(int i=0;i<n;i++){
            int j=i;
            int ele=i;
            while(j<n){
                long sum=pre[j]+1;
                int ind=lower(a,sum);
                ind--;
                if(ind==j){
                    break;
                }
                ele=ind;
                j=ind;
            }
            ans[(int)a[i][1]]=ele;
        }
        for(long ele:ans){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    private static int lower(long[][] a, long sum) {
        int l=0;
        int r=a.length;
        while(l<r){
            int mid=(l+r)/2;
            if(a[mid][0]<sum){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return r;
    }
}