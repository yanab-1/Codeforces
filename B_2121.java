
import java.util.Scanner;

public class B_2121 {
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
        int[] suf=new int[26];
        for(int i=1;i<n;i++){
            suf[s.charAt(i)-'a']++;
        }
        int[] pre=new int[26];
        pre[s.charAt(0)-'a']++;
        for(int i=1;i<n-1;i++){
            suf[s.charAt(i)-'a']--;
            char c=s.charAt(i);
            int ci=c-'a';
            if(pre[ci]>0 || suf[ci]>0){
                System.out.println("yes");
                return;
            }
            pre[s.charAt(i)-'a']++;
        }
        System.out.println("no");
    }
}
