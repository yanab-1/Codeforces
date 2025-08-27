import java.util.Scanner;

public class A_2134{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if((n-b) % 2 != 0){
            System.out.println("no");
            return;
        }
        long l = (n-b)/2;
        if(a <= b){
            System.out.println("yes");
            return;
        }
        if((n-a) % 2 == 0){
            System.out.println("yes");
            return;
        }
        if(a > b && (a-b) % 2 == 0){
            long l1 = (a-b)/2;
            if(l >= 1 && l1 <= l ){
                System.out.println("yes");
                return;
            }
            else{
                System.out.println("no");
                return;
            }
        }
        System.out.println("no");
    }
}