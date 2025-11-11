import java.util.Scanner;

public class C_2160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        String s = Long.toBinaryString(n);
        int i = 0;
        int j = s.length() - 1;
        while(i < s.length() && s.charAt(i) == '0'){
            i++;
        }
        while(j >= 0 && s.charAt(j) == '0'){
            j--;
        }
        if(i > j) {
            System.out.println("yes");
            return;
        } 
        boolean is = isPalindrome(s, i, j);
        if(is){
            int len = j - i + 1;
            if(len % 2 == 0){
                System.out.println("yes");
            }
            else if(s.charAt((i + j) / 2) == '0'){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        else{
            System.out.println("no");
        }
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
