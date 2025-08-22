import java.util.Scanner;

public class B_2131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(n==2){
            System.out.println("-1 2");
            return;
        }
        if(n%2==0){
            for(int i=0;i<n-1;i++){
                if(i%2==0){
                    System.out.print(-1+" ");
                } else {
                    System.out.print(3+" ");
                }
            }
            System.out.println(2);
        }
        else{
            for(int i=0;i<n;i++){
                if(i%2==0){
                    System.out.print(-1+" ");
                } else {
                    System.out.print(3+" ");    
                }
            }
            System.out.println();
        }
    }
}
