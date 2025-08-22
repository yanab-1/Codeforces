
import java.util.Scanner;

public class B_2104 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            long[] ans=new long[n];
            long sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            if(n==1){
                System.out.println(a[0]);
                continue;
            }
            ans[n-1]=sum;
            long min=a[0];
            for(int i=1;i<n;i++){
                if(a[i]<min){
                    sum-=a[i];
                }
                else{
                    sum-=min;
                    min=a[i];
                }
                ans[n-i-1]=sum;
            }
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
