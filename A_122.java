
import java.util.Scanner;

public class A_122 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();
        if(lucky(n)){
            System.out.println("YES");
            return;
        }
        for(int i=4;i<n;i++){
            if(lucky(i) && n%i==0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static boolean lucky(int n){
        while(n>0){
            if(n%10!=4 && n%10!=7){
                return false;
            }
            n/=10;
        }
        return true;
    }
}
