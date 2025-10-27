import java.util.Scanner;

public class G_2162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(n == 2) System.out.println(-1);
        else if(n == 3){
            System.out.println("1 3");
            System.out.println("2 3");
        }
        else if(n == 4){
            System.out.println("1 2");
            System.out.println("3 1");
            System.out.println("4 1");
        }
        else{
            System.out.println("1 2");
            System.out.println("2 3");
            System.out.println("3 4");
            System.out.println(1 + " " + n);
            for(int i = 5; i < n; i++){
                System.out.println(2 + " " + i);
            }
        }
    }
}
