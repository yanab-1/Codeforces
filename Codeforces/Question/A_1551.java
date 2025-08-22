
import java.util.Scanner;

public class A_1551{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=n%3;
            switch (ans) {
                case 0 -> System.out.println(n/3+" "+n/3);
                case 1 -> System.out.println((n/3+1)+" "+n/3);
                default -> System.out.println(n/3+" "+(n/3+1));
            }
        }
    }
}