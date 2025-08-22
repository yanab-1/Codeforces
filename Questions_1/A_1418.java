
import java.util.Scanner;

public class A_1418 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long k=sc.nextLong();
            long sticksrequired=k*y+k-1;
            System.out.println(((sticksrequired+x-2)/(x-1))+k);
        }
    }
}
