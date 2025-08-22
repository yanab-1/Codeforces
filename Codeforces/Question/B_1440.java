
import java.util.Scanner;

public class B_1440 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n*k];
            for(int i=0;i<n*k;i++){
                a[i]=sc.nextInt();
            }
            int x=(n+1)/2-1;
            x=n-x;
            int z=n*k;
            long ans=0;
            while(k-->0){
                z-=x;
                if(z<0){
                    break;
                }
                ans+=a[z];
            }
            System.out.println(ans);
        }
    }
}