
import java.util.Scanner;

public class A_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long a=sc.nextLong();
        System.out.println((long)(Math.ceil((double)n/a)*Math.ceil((double)m/a)));
    }
}

