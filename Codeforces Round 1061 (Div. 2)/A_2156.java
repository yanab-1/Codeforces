import java.util.Scanner;

public class A_2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        if(n <= 2){
            System.out.println(0);
        }
        else{
            System.out.println((n - 1) / 2);
        }
    }
}
