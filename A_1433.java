import java.util.Scanner;

public class A_1433 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String x=sc.next();
            int c=x.charAt(0)-'0'-1;
            int l=x.length();
            System.out.println((c*10+(l*(l+1))/2));
        }
    }
}
