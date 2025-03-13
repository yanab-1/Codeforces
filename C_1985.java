
import java.util.Scanner;

public class C_1985 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans=0;
            long m=0;
            long s=0;
            if(a[0]==0){
                ans++;
            }
            else{
                m=a[0];
            }
            for(int i=1;i<n;i++){
                if(a[i]>m){
                    s+=m;
                    m=a[i];
                }
                else{
                    s+=a[i];
                }
                if(s==m){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
