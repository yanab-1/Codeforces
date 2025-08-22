
import java.util.Scanner;

public class C_2121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] mat=new int[n][m];
            int max=Integer.MIN_VALUE;
            int mc=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    mat[i][j]=sc.nextInt();
                    if(mat[i][j]>max){
                        max=mat[i][j];
                        mc=1;
                    }
                    else if(mat[i][j]==max){
                        mc++;
                    }
                }
            }
            print(n,m,mat,max,mc);
        }
    }

    private static void print(int n, int m, int[][] mat,int max,int mc) {
        int[] row=new int[n];
        int[] col=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==max){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int c=row[i]+col[j];
                if(mat[i][j]==max){
                    c--;
                }
                if(c==mc){
                    System.out.println(max-1);
                    return;
                }
            }
        }
        System.out.println(max);
    }
}
