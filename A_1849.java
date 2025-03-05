
import java.util.Scanner;

public class A_1849 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int b=sc.nextInt();
            int c=sc.nextInt();
            int h=sc.nextInt();
            int l=1;
            b-=1;
            int f=c+h;
            while(b>0 && f>0){
                l+=2;
                b--;
                f--;
            }
            System.out.println(l);
        }
    }
}
