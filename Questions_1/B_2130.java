import java.util.Scanner;

public class B_2130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int s=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
            if(a[i]==0){
                c0++;
            }
            if(a[i]==1){
                c1++;
            }
            if(a[i]==2){
                c2++;
            }
        }
        if(sum==s){
            System.out.println(-1);
            return;
        }
        if(sum>s){
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            return;
        }
        if(s-sum==1){
            for(int i=0;i<c0;i++){
                System.out.print(0+" ");
            }
            for(int i=0;i<c2;i++){
                System.out.print(2+" ");
            }
            for(int i=0;i<c1;i++){
                System.out.print(1+" ");
            }
            System.out.println();
        }
        else{
            System.out.println(-1);
        }
    }
}
