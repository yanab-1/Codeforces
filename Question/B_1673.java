import java.util.Scanner;

public class B_1673 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        String s=sc.next();
        int i=0;
        int[] freq=new int[26];
        for(;i<s.length();i++){
            if(freq[s.charAt(i)-'a']<1){
                freq[s.charAt(i)-'a']++;
            }
            else{
                break;
            }
        }
        for(int j=i;j<s.length();j++){
            if(s.charAt(j)!=s.charAt(j-i)){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
 