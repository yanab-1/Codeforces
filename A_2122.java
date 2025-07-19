import java.util.Scanner;

public class A_2122 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n>1 && m>1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
