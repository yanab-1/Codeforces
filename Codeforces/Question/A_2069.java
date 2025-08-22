
import java.util.Scanner;

public class A_2069 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            if(s.contains("1 0 1")){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}
