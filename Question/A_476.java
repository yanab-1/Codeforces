
import java.util.Scanner;

public class A_476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=(n+1)/2;i<=n;i++){
            if(i%m==0){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
