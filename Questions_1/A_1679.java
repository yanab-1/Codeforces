
import java.util.Scanner;

public class A_1679 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(n<4 || n%2==1){
                System.out.println(-1);
            }
            else{
                System.out.println((n+5)/6+" "+n/4);
            }
        }
    }
}
