
import java.util.Scanner;

public class A_1726 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<n-1;i++){
                ans=Math.max(ans,a[n-1]-a[i]);
            }
            for(int i=1;i<n;i++){
                ans=Math.max(ans,a[i]-a[0]);
            }
            for(int i=0;i<n;i++){
                ans=Math.max(ans,a[(i-1+n)%n]-a[i]);
            }
            System.out.println(ans);
        }
    }
}
