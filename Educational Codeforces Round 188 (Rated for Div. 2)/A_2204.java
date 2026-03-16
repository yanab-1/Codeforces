import java.util.Scanner;

public class A_2204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for(int i = 0; i < n; i++){
            count++;
            if(s.charAt(i) == 'L'){
                break;
            }
        }
        System.out.println(count);
    }
}
