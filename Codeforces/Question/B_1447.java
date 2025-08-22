import java.util.Scanner;

public class B_1447 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            int haszero=0;
            long sum=0;
            int neg=0;
            int small=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
                    if(arr[i][j]==0){
                        haszero=1;
                    }
                    sum+=Math.abs(arr[i][j]);
                    if(arr[i][j]<0){
                        neg++;                       
                    }
                    small=Math.min(small,Math.abs(arr[i][j]));
                }
            }   
            if(haszero==1||neg%2==0){
                System.out.println(sum);
            }else{
                System.out.println(sum-2*small);
            }
        }
    }
}
