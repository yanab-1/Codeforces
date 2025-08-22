import java.util.Scanner;

public class A_2102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(n%p==0){
                int ne=(n/p)*q;
                if(ne==m){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
