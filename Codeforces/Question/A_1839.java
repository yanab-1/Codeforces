
import java.util.Scanner;

public class A_1839 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.println((n-2+k)/k+1);
        }
    }
}
