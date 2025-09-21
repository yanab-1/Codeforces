import java.util.Scanner;

public class A_2147{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(y > x){
            System.out.println(2);
            return;
        }
        if(y >= 2 && x - y >= 2){
            System.out.println(3);
            return;
        }
        System.out.println(-1);
    }
}