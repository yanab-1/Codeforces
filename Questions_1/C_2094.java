import java.util.Scanner;

public class C_2094 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[][] a=new int[n][n];
            int[] ans=new int[2*n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=sc.nextInt();
                    ans[i+j+1]=a[i][j];
                }
            }
            int sum=0;
            for(int i=0;i<2*n;i++){
                sum+=ans[i];
            }
            ans[0]=(2*n+1)*n-sum;
            for(int i=0;i<2*n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
