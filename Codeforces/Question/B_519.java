
import java.util.Scanner;

public class B_519{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            sum+=a;
        }
        long sum1=0;
        for(int i=0;i<n-1;i++){
            int b=sc.nextInt();
            sum1+=b;
        }
        long sum2=0;
        for(int i=0;i<n-2;i++){
            int c=sc.nextInt();
            sum2+=c;
        }
        System.out.println(sum-sum1);
        System.out.println(sum1-sum2);
    }
}