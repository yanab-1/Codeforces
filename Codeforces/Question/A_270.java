import java.util.Scanner;

public class A_270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            if(360%(180-a)==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
