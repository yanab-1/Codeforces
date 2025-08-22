
import java.util.Scanner;

public class A_1883 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        System.out.println(morning(n));
        }
    }
    public static int morning(int n){
        int i=n%10;
        if(i==0){
            i=10;
        }
        n/=10;
        int oper=1;
        int c=1;
        while(n>=0){
            if(c==4){
                break;
            }
            c++;
            int next=n%10;
            if(next==0){
                next=10;
            }
            oper+=Math.abs(next-i)+1;
            i=next;
            n/=10;
        }
        oper+=Math.abs(i-1);
        return oper;

    }
}