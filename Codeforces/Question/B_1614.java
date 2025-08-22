
import java.util.Arrays;
import java.util.Scanner;

public class B_1614{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[][] a=new int[n][2];
            for(int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=i+1;
            }
            Arrays.sort(a,(o1,o2)->o2[0]-o1[0]);
            int[] ans=new int[n+1];
            ans[0]=0;
            int idx=1;
            long res=0;
            for(int i=0;i<n;i++){
                ans[a[i][1]]=idx;
                res+=((long)2*a[i][0]*Math.abs(idx));
                if(i%2==0){
                    idx=-idx;
                }
                else{
                    idx=-idx;
                    idx++;
                }
            }
            System.out.println(res);
            for(int i=0;i<n+1;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}