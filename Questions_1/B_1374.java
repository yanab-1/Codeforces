
import java.util.Scanner;

public class B_1374 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int c2=0;
            int c3=0;
            while(n%2==0){
                c2++;
                n/=2;
            }
            while(n%3==0){
                c3++;
                n/=3;
            }
            if(n==1 && c2<=c3){
                System.out.println(2*c3-c2);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
