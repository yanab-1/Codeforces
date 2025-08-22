
import java.util.Scanner;

public class A_1475 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if((n&(n-1))==0){
                System.out.println("no");
                continue;
            }
            System.out.println("yes");
        }
    }
}
