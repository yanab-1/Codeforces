import java.util.Scanner;

public class B_535 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        String s = sc.next();
        int n = s.length();
        int c = (1 << n) - 2;
        int pos = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '7'){
                c += (1 << pos);
            }
            pos++;
        }
        System.out.println(c + 1);
    }
}
