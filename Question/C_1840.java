
import java.util.Scanner;

public class C_1840 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int q=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();  
            }
            long c=0;
            long ans=0;
            long ci=0;
            for(int i=0;i<n;i++){
                if(a[i]<=q){
                    c++;
                    if(c>=k){
                        ci++;
                        ans+=ci;
                    }
                }
                else{
                    c=0;
                    ci=0;
                }
            }
            System.out.println(ans);
        }
    }
}
