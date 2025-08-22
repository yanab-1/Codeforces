
import java.util.Scanner;

public class B_102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=0;
        while(s.length()>1){
            ans++;
            long t=0;
            for(char c:s.toCharArray()){
                t+=c-'0';
            }
            s=Long.toString(t);
        }
        System.out.println(ans);
    }
}
