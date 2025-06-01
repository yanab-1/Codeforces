
import java.util.Scanner;

public class A_2116 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int ming=Math.min(a,c);
            int minf=Math.min(b,d);
            if(ming==minf){
                System.out.println("Gellyfish");
            }
            else if(ming<minf){
                System.out.println("Flower");
            }
            else{
                System.out.println("Gellyfish");
            }
        }
    }
}
