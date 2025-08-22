import java.util.Arrays;
import java.util.Scanner;

public class D_2051 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long x=sc.nextLong();
            long y=sc.nextLong();
            long[] a=new long[n];
            long totalsum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                totalsum+=a[i];
            }
            long count=0;
            Arrays.sort(a);
            for(int i=0;i<n;i++){
                long rem=totalsum-a[i];
                int low=lowerbound(a, i, n, rem, y);
                int up=upperbound(a, i, n, rem, x);
                if(up>=low){
                    count+=(up-low+1);
                }
            }
            System.out.println(count);
        }
    }
    public static int upperbound(long[] a,int i,int n,long rem,long x){
        int low=i+1;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(rem-a[mid]<x){ 
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high;
    }
    public static int lowerbound(long[] a,int i,int n,long rem,long y){
        int low=i+1;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(rem-a[mid]<=y){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
