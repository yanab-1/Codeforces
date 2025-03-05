
import java.util.Scanner;

public class A_1537 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                sum+=a;
            }
            if(sum==n){
                System.out.println(0);
            }
            else if(sum<n){
                System.out.println(1);
            }
            else{
                System.out.println(sum-n);
            }
        }
    }
}
