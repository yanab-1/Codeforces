
import java.util.Scanner;

public class A_1955 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans1=n/2*b;
            int ans2=(n%2)*a;
            if(a*2>=b){
            System.out.println(ans1+ans2);
            }else{
                System.out.println(a*n);
            }
        }
    }
}
