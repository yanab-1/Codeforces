import java.util.Arrays;
import java.util.Scanner;
public class D_2126 {
    static class casino{
        long l,r,real;
        public casino(long l,long r,long real){
            this.l=l;
            this.r=r;
            this.real=real;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        long k=sc.nextLong();
        casino[] arr=new casino[n];
        for(int i=0;i<n;i++){
            arr[i]=new casino(sc.nextLong(),sc.nextLong(),sc.nextLong());
        }
        Arrays.sort(arr,(a,b)->(int)(a.l-b.l));
        for(int i=0;i<n;i++){
            if(k<=arr[i].r && k>=arr[i].l && k<arr[i].real){
                k=arr[i].real;
            }
        }
        System.out.println(k);
    }
}
