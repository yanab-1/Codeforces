
import java.util.Scanner;

public class B_2103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0;
            if(s.charAt(0)!='0'){
                ans=1;
            }
            for(int i=1;i<n;i++){
                if(s.charAt(i)!=s.charAt(i-1)){
                    ans++;
                }
            }
            if(ans==2){
                ans--;
            }
            else if(ans>2){
                ans-=2;
            }
            System.out.println(ans+n);
        }
    }
}
