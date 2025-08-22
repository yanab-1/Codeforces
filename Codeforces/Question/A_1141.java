
import java.util.Scanner;

public class A_1141 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n==m){
            System.out.println(0);
            return;
        }
        if(m%n!=0){
            System.out.println(-1);
            return;
        }
        int op=0;
        m/=n;
        while(m>1){
            if(m%2==0){
                m/=2;
            }
            else if(m%3==0){
                m/=3;
            }
            else{
                System.out.println(-1);
                return;
            }
            op++;
        }
        System.out.println(op);
    }
}
