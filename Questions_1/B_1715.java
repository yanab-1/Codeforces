import java.util.Scanner;

public class B_1715{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int b=sc.nextInt();
            long s=sc.nextLong();
            long[] a=new long[n];
            long min=(long) k*b;    
            long max=min+(long)(k-1)*n;
            if(s>=min && s<=max){
                a[0]=min;
                long curr=min;
                for(int i=0;i<n;i++){
                    long ad=Math.min(s-curr,k-1);
                    a[i]+=ad;
                    curr+=ad;
                }
                for(int i=0;i<n;i++){
                    System.out.print(a[i]+" ");
                }
            }
            else{
                System.out.println(-1);
            }
        }
    }
}