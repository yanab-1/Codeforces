
import java.util.Scanner;

public class D_1791 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int[] c=new int[26];
            int[] p=new int[26];
            for(char ch:s.toCharArray()){
                c[ch-'a']++;
            }
            int ans=0;
            for(char ch:s.toCharArray()){
                c[ch-'a']--;
                p[ch-'a']++;
                int cu=0;
                for(int j=0;j<26;j++){
                    cu+=Math.min(c[j],1)+Math.min(p[j],1);
                }
                ans=Math.max(ans,cu);
            }
            System.out.println(ans);
        }
    }
}
