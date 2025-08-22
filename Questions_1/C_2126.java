import java.util.Arrays;
import java.util.Scanner;

public class C_2126 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int k=sc.nextInt()-1;
        int[] h=new int[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        int hk=h[k];
        Arrays.sort(h);
        if(hk==h[n-1]){
            System.out.println("yes");
            return;
        }
        int l=0;
        int r=n;
        while(l<r){
            int mid=l+(r-l)/2;
            if(h[mid]<=hk){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        int idx=l;
        int c=hk;
        for(int i=idx;i<n;i++){
            if(h[i]<=c+hk){
                c=h[i];
                if(c==h[n-1]){
                    break;
                }
            }
            else{
                break;
            }
        }
        if(c==h[n-1]){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
