import java.util.Scanner;

public class A_2145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(n % 3 == 0){
            System.out.println(0);
        }
        else{
            System.out.println(3 - n % 3);
        }
    }
}
