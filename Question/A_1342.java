
import java.util.Scanner;

public class A_1342 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            b=Math.min(b,2*a);
            if(x>y){
                int temp=x;
                x=y;
                y=temp;
            }
            System.out.println((long)(y-x)*a+(long)x*b);
        }
    }
}
