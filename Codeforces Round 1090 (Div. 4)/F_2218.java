import java.util.Scanner;

public class F_2218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = x + y;
        if(x > y){
            System.out.println("No");
            return;
        }
        if(x == 0){
            if(y % 2 == 0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
                for(int i = 2; i <= n; i++){
                    System.out.println(1 + " " + i);
                }
            }
        }else{
            System.out.println("Yes");
            int l = 2;
            int r = n;
            if(n % 2 == 0) x--;
            while(x-- > 0){
                System.out.println(1 + " " + r);
                System.out.println(r + " " + l);
                r--;
                l++;
            }
            while(l <= r){
                System.out.println(1 + " " + l);
                l++;
            }
        }
    }
}
