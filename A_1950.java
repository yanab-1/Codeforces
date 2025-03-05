
import java.util.Scanner;

public class A_1950 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if (b>a && b>c){
                System.out.println("PEAK");
            }
            else if(b>a && c>b){
                System.out.println("STAIR");
            }
            else{
                System.out.println("NONE");
            }

        }
    }
}
