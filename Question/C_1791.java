
import java.util.Scanner;

public class C_1791 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int i=0;
            int j=n-1;
            while(i<j){
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }
                i++;
                j--;
            }
            if(i==j){
                System.out.println(1);
            }
            else if(i>j){
                System.out.println(0);
            }
            else{
                System.out.println(j-i+1);
            }
        }
    }
}
