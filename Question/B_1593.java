
import java.util.Scanner;

public class B_1593 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            String[] arr={"00","25","50","75"};
            int ans=Integer.MAX_VALUE;
            for(String s:arr){
                ans=Math.min(ans,find(s,n));
            }
            System.out.println(ans);
        }
    }

    private static int find(String s, String n) {
        int ans=0;
        int i=n.length()-1;
        while(i>=0 &&  s.charAt(1)!=n.charAt(i)){
            ans++;
            i--;
        }
        if(i<0){
            return Integer.MAX_VALUE;
        }
        i--;
        while(i>=0 && s.charAt(0)!=n.charAt(i)){
            ans++;
            i--;
        }
        return i<0?Integer.MAX_VALUE:ans;
    }
}
