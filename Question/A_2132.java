import java.util.Scanner;

public class A_2132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String a = sc.next();
        int m = sc.nextInt();
        String b = sc.next();
        String c = sc.next();
        StringBuilder one = new StringBuilder(a);
        int i=0;
        for(char ch: c.toCharArray()) {
            if(ch == 'V'){
                one.insert(0,b.charAt(i++));
            }
            else{
                one.append(b.charAt(i++));
            }
        }
        System.out.println(one.toString());
    }

}
