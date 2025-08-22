
import java.util.Scanner;

public class D_2123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            print(n, k, s);
        }
    }

    private static void print(int n, int k, String s) {
        int t=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='1'){
                t++;
            }
        }
        if(t<=k || n<2*k){
            System.out.println("Alice");
        }else {
            System.out.println("Bob");
        }
    }
}
