
import java.util.*;

public class B_2075 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if(k==1){
                int res=a[0]+a[n-1];
                int b=Math.max(a[0], a[n-1]);
                for(int i=1;i<n-1;i++){
                    res=Math.max(res, a[i]+b);
                }
                System.out.println(res);
                continue;
            }
            Arrays.sort(a);
            long ans=0;
            for(int i=n-1;i>=n-k-1;i--){
                ans+=a[i];
            }
            System.out.println(ans);
        }
    }
}
