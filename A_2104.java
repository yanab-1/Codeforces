
import java.util.Scanner;

public class A_2104{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int diff1=b-a;
            int diff2=c-b;
            diff2-=diff1;
            if(diff2>=0 && diff2%3==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}