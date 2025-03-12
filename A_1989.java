
import java.util.Scanner;

public class A_1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y<=-2){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
