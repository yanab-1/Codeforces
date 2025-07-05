
import java.util.Scanner;

public class E_1850{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long c=sc.nextLong();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            print(n,c,a); 
        }
    }

    private static void print(int n, long c, long[] a) {
        long l=1;
        long r=Integer.MAX_VALUE;
        while(l<=r){
            long mid=l+(r-l)/2;
            long sum=0;
            for(int i=0;i<n;i++){
                long val=mid*2+a[i];
                long sq=val*val;
                sum+=sq;
                if(sum>c){
                    break;
                }
            }
            if(sum==c){
                System.out.println(mid);
                return;
            }
            else if(sum<c){
                l=mid+1;
            } else {
                r=mid-1;
            }
        }
    }
}