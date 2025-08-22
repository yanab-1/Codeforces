
import java.util.Scanner;

public class A_2092 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long min=Long.MAX_VALUE;
            long max=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                long a=sc.nextLong();
                min=Math.min(min,a);
                max=Math.max(max,a);
            }
            System.out.println(max-min);
        }
    }
}
