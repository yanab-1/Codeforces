import java.util.Scanner;

public class B_2113 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int w=sc.nextInt();
            int h=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            if (x1 == x2) {
                if (Math.abs(y1 - y2) % b == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                continue;
            }

            if (y1 == y2) {
                if (Math.abs(x1 - x2) % a == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                continue;
            }

            if ((x1 - x2) % a == 0 || (y1 - y2) % b == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }                                                                       
    }
}
