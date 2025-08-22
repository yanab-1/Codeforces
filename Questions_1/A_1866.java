import java.util.Scanner;

public class A_1866 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]<0){
                a[i]*=-1;
            }
            ans=Math.min(ans,a[i]);
        }
        System.out.println(ans);
    }
}
