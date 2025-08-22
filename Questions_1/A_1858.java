
import java.util.Scanner;

public class A_1858 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            a+=(c+1)/2;
            b+=(c/2);
            if(a>b){
                System.out.println("First");
            }
            else{
                System.out.println("Second");
            }
        }
    }
}
