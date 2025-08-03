import java.util.Scanner;

public class B_2059 {
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
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if(k==n){
            for(int i=1;i<n;i+=2){
                if(a[i]!=(i+1)/2){
                    System.out.println((i+1)/2);
                    return;
                }
            }
            System.out.println(k/2+1);
        }
        else{
            for(int i=1;i<=n-k+1;i++){
                if(a[i]!=1){
                    System.out.println(1);
                    return;
                }
            }
            System.out.println(2);
        }
    }
}
