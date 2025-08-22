
import java.util.Scanner;

public class C_1352 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            long bs=n-1;
            long b=k/bs;
            long rem=k%bs;
            long ans=b*n+rem;
            if(rem==0){
                ans--;
            }
            System.out.println(ans);
        }

    }
}
