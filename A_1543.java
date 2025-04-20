
import java.util.Scanner;

public class A_1543 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long max=Math.abs(a-b);
            if(max==0){
                System.out.println(0+" "+0);
                continue;
            }
            long move=Math.min(a%max,max-a%max);
            System.out.println(max+" "+move);
        }
    }
}
