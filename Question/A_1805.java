
import java.util.Scanner;

public class A_1805 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int xor=0;
            for(int i=0;i<n;i++){
                xor^=sc.nextInt();
            }
            if(n%2!=0){
                System.out.println(xor);
            }
            else if(xor==0){
                System.out.println(0);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
