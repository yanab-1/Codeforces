
import java.util.Scanner;

public class B_1373 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int c0=0;
            int c1=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    c0++;
                }
                else{
                    c1++;
                }
            }
            int n=Math.min(c0,c1);
            if(n%2==0){
                System.out.println("NET");
            }
            else{
                System.out.println("DA");
            }
        }
    }
}
