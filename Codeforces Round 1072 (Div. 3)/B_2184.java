import java.util.Scanner;

public class B_2184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int s = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        if(k > m){
            System.out.println(s - m <= 0 ? 0 : s - m);  
            return;
        }
        if(s < k){
            int rem = m % k;
            System.out.println(s - rem <= 0 ? 0 : s - rem);
        }
        else{
            int filhal = m / k;
            if(filhal % 2 == 0){
                int rem = m % k;
                System.out.println(s - rem <= 0 ? 0 : s - rem);
            }
            else{
                int rem = m % k;
                System.out.println(k - rem <= 0 ? 0 : k - rem);
            }
        }
    }
}