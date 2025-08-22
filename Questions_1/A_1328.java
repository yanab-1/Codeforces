
import java.util.Scanner;

public class A_1328 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int mod=a%b;
            if(mod==0){
                System.out.println(0);
            }
            else{
                System.out.println(b-mod);
            }
        }
    }
}
