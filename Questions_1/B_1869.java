import java.util.Scanner;

public class B_1869 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            long[] x=new long[n];
            long[] y=new long[n];
            for(int i=0;i<n;i++){
                x[i]=sc.nextLong();
                y[i]=sc.nextLong();
            }
            long ans=Math.abs(x[a-1]-x[b-1]) + Math.abs(y[a-1]-y[b-1]);
            long min1=Long.MAX_VALUE;
            long min2=Long.MAX_VALUE;
            for(int i=0;i<k;i++){
                long dx1 = Math.abs(x[a - 1] - x[i]);
                long dy1 = Math.abs(y[a - 1] - y[i]);
                min1 = Math.min(min1, dx1 + dy1);

                long dx2 = Math.abs(x[b - 1] - x[i]);
                long dy2 = Math.abs(y[b - 1] - y[i]);
                min2 = Math.min(min2, dx2 + dy2);
            }
            System.out.println(Math.min(ans, min1 + min2));
        }
    }
}
