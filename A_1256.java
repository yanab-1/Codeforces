
import java.util.Scanner;

public class A_1256 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int s=sc.nextInt();
            int x=s/n;
            if(x<=a){
                if(x*n+b>=s){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            else{
                if(b+a*n>=s){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
