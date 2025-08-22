import java.util.Scanner;

public class B_1797 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=a[n-1-i][n-1-j]){
                    c++;
                }
            }
        }
        c/=2;
        if(c>k){
            System.out.println("NO");
        }
        else{
            c-=k;
            if(n%2==1){
                System.out.println("YES");
            }
            else if(c%2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
