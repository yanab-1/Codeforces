import java.util.Scanner;

public class B_581 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }
    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int[] h=new int[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        int[] res=new int[n];
        int max=0;
        for(int i=n-1;i>=0;i--){
            if(h[i]>max){
                res[i]=0;
            }
            else{
                res[i]=max-h[i]+1;
            }
            max=Math.max(max,h[i]);
        }
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
