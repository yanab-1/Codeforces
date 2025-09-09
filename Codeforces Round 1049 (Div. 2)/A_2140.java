import java.util.Scanner;

public class A_2140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        int z = 0;
        for(char c: s.toCharArray()){
            if(c == '0') z++;
        }
        int one = 0;
        for(int i = 0; i < z; i++){
            if(s.charAt(i) == '1') one++;
        }
        System.out.println(one);
    }
}