
import java.util.Scanner;

public class B_1624 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int diff=c-b;
            if(2*b==a+c){
                System.out.println("yes");
                continue;
            }
            if(b-diff>0 && (b-diff)%a==0){
                System.out.println("yes");
                continue;
            }
            diff=b-a;
            if(b+diff>0 && (b+diff)%c==0){
                System.out.println("yes");
                continue;
            }
            if((a+c)%(2*b)==0){
                System.out.println("yes");
                continue;
            }
            System.out.println("no");
        }
    }
}
