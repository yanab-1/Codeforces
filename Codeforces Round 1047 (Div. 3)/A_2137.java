
import java.util.Scanner;

public class A_2137{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int k = sc.nextInt();
        int x = sc.nextInt();
        while(k -- > 0){
            x *= 2;
        }
        System.out.println(x);
    }
    
}