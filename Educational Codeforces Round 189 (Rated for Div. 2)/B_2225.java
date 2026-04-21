import java.util.Scanner;

public class B_2225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        String s = sc.next();
        int c = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                c++;
            }
        }
        if(c > 2){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
