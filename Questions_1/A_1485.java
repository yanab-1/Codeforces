
import java.util.Scanner;

public class A_1485 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int res=Integer.MAX_VALUE;
            for(int i=0;i<32;i++){
                int B=b+i;
                int op=i;
                int A=a;
                if(B==1) continue;
                while(A>0){
                    A/=B;
                    op++;
                }
                res=Math.min(res,op);
            }
            System.out.println(res);
        }
    }
}
