
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class D_2114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] x=new int[n][2];
            int[][] y=new int[n][2];
            for(int i=0;i<n;i++){
                x[i][0]=sc.nextInt();
                y[i][0]=sc.nextInt();
                x[i][1]=y[i][1]=i;
            }
            Arrays.sort(x,(a,b)->Integer.compare(a[0],b[0]));
            Arrays.sort(y,(a,b)->Integer.compare(a[0],b[0]));
            long ans=rec_area(x[0][0], x[n-1][0], y[0][0], y[n-1][0], n);
            if(n==1){
                System.out.println(ans);
                continue;
            }
            HashSet<Integer> extreme=new HashSet<>();
            extreme.add(x[0][1]);
            extreme.add(x[n-1][1]);
            extreme.add(y[0][1]);
            extreme.add(y[n-1][1]);
            for(int i:extreme){
                int minx=x[0][1]==i?x[1][0]:x[0][0];
                int maxx=x[n-1][1]==i?x[n-2][0]:x[n-1][0];
                int miny=y[0][1]==i?y[1][0]:y[0][0];
                int maxy=y[n-1][1]==i?y[n-2][0]:y[n-1][0];
                ans=Math.min(ans,rec_area(minx,maxx,miny,maxy,n));
            }
            System.out.println(ans);
        }
    }
    public static long rec_area(int minx,int maxx,int miny,int maxy,int n){
        long l=maxx-minx+1;
        long h=maxy-miny+1;
        if(n>l*h){
            return Math.min(h*(l+1),l*(h+1));
        }
        return l*h;
    }
}
