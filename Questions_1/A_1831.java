import java.util.Scanner;

public class A_1831 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                System.out.print(n+1-a+" ");
            }
            System.out.println();
        }
    }
}
