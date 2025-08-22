import java.util.Scanner;

public class A_2123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            print(n);
        }
    }

    private static void print(int n) {
        if(n%4==0){
            System.out.println("BOB");
        } else {
            System.out.println("ALICE");
        }
    }
}
