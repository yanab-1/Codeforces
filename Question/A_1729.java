
import java.util.Scanner;

public class A_1729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int fir=a-1;
            int sec=2*c-b-1;
            if(b>c){
                sec=b-1;
            }
            if(fir>sec){
                System.out.println(2);
            }
            else if(fir==sec){
                System.out.println(3);
            }
            else{
                System.out.println(1);
            }
        }
    }

}