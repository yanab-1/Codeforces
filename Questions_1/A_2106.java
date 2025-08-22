
import java.util.Scanner;

public class A_2106 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1'){
                    c++;
                }
            }
            int c0=n-c;
            int ans=c0*(c+1)+c*(c-1);
            System.out.println(ans);
        }
    }
}
