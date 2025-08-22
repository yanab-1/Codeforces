
import java.util.Scanner;

public class A_2090 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long a=sc.nextLong();
            long sum=x+y;
            long k=(long)((a+0.5)/sum);
            double rem=(a+0.5)-k*sum;
            if(rem<=x+1e-9){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}
