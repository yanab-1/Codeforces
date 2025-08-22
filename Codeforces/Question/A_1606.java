
import java.util.Scanner;

public class A_1606 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            if(s.charAt(0)==s.charAt(n-1)){
                System.out.println(s);
            }
            else{
                System.out.println(s.substring(0,n-1)+s.charAt(0));
            }
        }
    }
}
