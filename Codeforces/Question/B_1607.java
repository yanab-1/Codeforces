
import java.util.Scanner;

public class B_1607 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            long n=sc.nextLong();
            int mod=(int) (n%4);
            long d=0;
            switch (mod) {
                case 1 -> d=-n;
                case 2 -> d=1;
                case 3 -> d=n+1;
                default -> {
                }
            }
            System.out.println(x%2==0 ? x+d:x-d);
        }
    }
}


