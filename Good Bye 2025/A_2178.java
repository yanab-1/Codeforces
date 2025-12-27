
import java.util.Scanner;

public class A_2178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        String s = sc.next();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'Y') {
                count++;
            }
        }
        if(count <= 1)
            System.out.println("YES");
        else
            System.out.println("NO");
       
    }
}
