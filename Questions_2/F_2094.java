import java.util.Scanner;

public class F_2094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if(m % k == 0){
            for(int i = 0; i < n; i++){
                int c;
                if(i % 2 == 0){
                   c = 0;
                }
                else{
                    c = 1;
                }
                for(int j = 0; j < m; j++){
                    System.out.print((1 + ((c + k) % k)) + " ");
                    c++;
                }
                System.out.println();
            }
        }
        else{
            int c = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print((1 + c % k) + " ");
                    c++;
                }
                System.out.println();
            }
        }
    }
}
