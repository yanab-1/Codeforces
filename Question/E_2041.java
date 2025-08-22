import java.util.Scanner;

public class E_2041 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }
    private static void solve(Scanner sc) {
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println(1);
            System.out.println(a);
            return;
        }
        System.out.println(3);
        System.out.println((3*a-2*b)+" "+(b)+" "+(b));
    }
}
