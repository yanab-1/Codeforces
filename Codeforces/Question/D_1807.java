 
import java.util.Scanner;
 
public class D_1807 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt()%2;
            }
            int[] pre=new int[n+1];
            int[] suf=new int[n+1];
            for(int i=1;i<=n;i++){
                pre[i]=pre[i-1]+a[i-1];
            }
            for(int i=n-1;i>=0;i--){
                suf[i]=suf[i+1]+a[i];
            }
            for(int i=0;i<q;i++){
                int l=sc.nextInt()-1;
                int r=sc.nextInt()-1;
                int k=sc.nextInt()%2;
                int sum=k*(r-l+1)+pre[l]+suf[r+1];
                if(sum%2==0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("Yes");
                }
            }
        }
    }
}
