import java.util.Scanner;

public class B_1821 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int l=-1;
        int r=-1;
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                r=i;
                if(l==-1){
                    l=i;
                }
            }
        }
        while(l>0 && b[l-1]<=b[l]){
            l--;
        }
        while(r<n-1 && b[r]<=b[r+1]){
            r++;
        }
        l++;
        r++;
        System.out.println(l+" "+r);
    }
}
