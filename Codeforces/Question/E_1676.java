
import java.util.Arrays;
import java.util.Scanner;

public class E_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            reverse(a);
            int[] pre=new int[n];
            pre[0]=a[0];
            for(int i=1;i<n;i++){
                pre[i]=pre[i-1]+a[i];
            }
            while(q-->0){
                int x=sc.nextInt();
                int l=1;
                int r=n;
                int ans=-1;
                while(l<=r){
                    int mid=(l+r)/2;
                    if(pre[mid-1]>=x){
                        ans=mid;
                        r=mid-1;
                    }
                    else{
                        l=mid+1;
                    }
                }
                System.out.println(ans);
            }
        }
    }
    public static void reverse(int[] a){
        int n=a.length;
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
    }
}
