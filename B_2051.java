
import java.util.Scanner;

public class B_2051 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum=a+b+c;
            int days=(n/sum)*3;
            if(n%sum==0){
                System.out.println(days);
            }else{
                int rem=n%sum;
                if(rem<=a){
                    System.out.println(days+1);
                }else if(rem<=a+b){
                    System.out.println(days+2);
                }else{
                    System.out.println(days+3);
                }
            }
        }
    }
}
