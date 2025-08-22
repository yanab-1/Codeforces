
import java.util.HashSet;
import java.util.Scanner;

public class B_1917 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            print(n,s);
        }
    }

    private static void print(int n, String s) {
        HashSet<Character> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
            ans+=set.size();
        }
        System.out.println(ans);

    }
}
