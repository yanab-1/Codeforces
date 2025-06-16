import java.util.Scanner;

public class A_1362 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long ra=a;
            while(ra%2==0){
                ra/=2;
            }
            long rb=b;
            while(rb%2==0){
                rb/=2;
            }
            if(ra!=rb){
                System.out.println(-1);
                continue;
            }
            a/=ra;
            b/=rb;
            int la=(int)(Math.log(a)/Math.log(2));
            int lb=(int)(Math.log(b)/Math.log(2));
            System.out.println((int)Math.ceil(Math.abs(la-lb)/3.0));
        }
    }
}
