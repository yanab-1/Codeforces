import java.util.Scanner;

public class E_1873 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long x=sc.nextLong();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            print(a, n, x);
        }
    }

    private static void print(long[] a, int n, long x) {
        long l=1;
        long r=Integer.MAX_VALUE;
        long ans=0;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(ispossible(a,mid,x)){
                ans=mid;
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        System.out.println(ans);
    }

    private static boolean ispossible(long[] a, long mid, long x) {
        long sum=0;
        for(long i:a){
            if(i<mid){
                sum+=(mid-i);
            }
        }
        return sum<=x;
    }
}