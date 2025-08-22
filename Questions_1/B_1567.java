import java.util.Scanner;

public class B_1567 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){   
            int a=sc.nextInt();
            int b=sc.nextInt();
            int xor;
            xor = switch (a % 4) {
                case 1 -> a - 1;
                case 2 -> 1;
                case 3 -> a;
                default -> 0;
            };
            if(xor==b){
                System.out.println(a);
            }
            else if((b^xor)!=a){
                System.out.println(a+1);
            }
            else{
                System.out.println(a+2);
            }
        }
    }
}
