import java.util.Scanner;

public class B_2090 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            boolean flag=true;
            for(int i=0;i<n;i++){
                String r=sc.next();
                for(int j=0;j<m;j++){
                    arr[i][j]=r.charAt(j)-'0';
                }
            }
            for(int i=0;i<n && flag;i++){
                for(int j=0;j<m && flag;j++){
                    if(arr[i][j]==1){
                        boolean row=true;
                        for(int k=0;k<=j;k++){
                            if(arr[i][k]!=1){
                                row=false;
                                break;
                            }
                        }
                        boolean col=true;
                        for(int k=0;k<=i;k++){
                            if(arr[k][j]!=1){
                                col=false;
                                break;
                            }
                        }
                        if(!row && !col){
                            flag=false;
                        }
                    }
                }
            }
            if(flag){
                System.out.println("yes");;
            }   
            else{
                System.out.println("no");
            }  
        }
    }
}
