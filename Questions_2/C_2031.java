import java.util.Scanner;

public class C_2031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(n % 2 == 1){
            if(n < 27){
                System.out.println(-1);
                return;
            }
            System.out.print("1 2 2 3 3 4 4 5 5 1 6 7 7 8 8 9 9 10 10 11 11 12 12 13 13 1 6 ");
            for(int i=14; i<=n/2; i++){
                System.out.print(i + " " + i + " ");
            }
        }
        else{
            for(int i=1; i<=n/2; i++){
                System.out.print(i + " " + i + " ");
            }
            System.out.println();
        }
    }
}
