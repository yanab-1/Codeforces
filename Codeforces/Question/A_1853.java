
import java.util.Scanner;

public class A_1853 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            boolean flag=false;
            int ans=Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                if(a[i]<a[i-1]){
                    System.out.println(0);
                    flag=true;
                    break;
                }
                ans=Math.min(ans,a[i]-a[i-1]);
            }
            if(!flag){
                System.out.println(ans/2+1);
            }
        }
    }
}
