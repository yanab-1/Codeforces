
import java.util.Scanner;

public class E_2044 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long k=sc.nextLong();
            long l1=sc.nextLong();
            long r1=sc.nextLong();
            long l2=sc.nextLong();
            long r2=sc.nextLong();
            long kn=1,ans=0;
            while(r2/kn>=l1){
                ans+=Math.max(0,Math.min(r2/kn,r1)-Math.max((l2-1)/kn+1,l1)+1);
                if(kn>Long.MAX_VALUE/k){
                    break;
                }
                kn*=k;
            }
            System.out.println(ans);
        }
    }
}
