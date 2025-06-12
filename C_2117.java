
import java.util.Arrays;
import java.util.Scanner;

public class C_2117 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n+2];
            int[] f=new int[n+2];
            int[] ne=new int[n+2];
            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.fill(f,1,n+1,n+1);
            for(int i=n;i>=1;i--){
                ne[i]=f[a[i]];
                f[a[i]]=i;
            }
            int p=1;
            int c=0;
            while(p<=n){
                int e=p;
                while(true){
                    int nn=0;
                    for(int i=p;i<=e;i++){
                        nn=Math.max(nn,ne[i]);
                    }
                    c++;
                    if(nn>n){
                        break;
                    }
                    p=e+1;
                    e=nn;
                }
                break;
            }
            System.out.println(c);
        }
    }
}
