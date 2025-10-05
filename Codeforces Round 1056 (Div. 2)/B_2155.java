import java.util.Scanner;

public class B_2155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n * n - k == 1){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(k > 0){
                    System.out.print('U');
                    k--;
                }
                else{
                    if(i != n - 1){
                        System.out.print('D');
                    }
                    else{
                        if(j != n - 1){
                            System.out.print('R');
                        }
                        else{
                            System.out.print('L');
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
