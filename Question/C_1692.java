
import java.util.Scanner;

public class C_1692 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            char[][] c=new char[8][8];
            for(int i=0;i<8;i++){
                String s=sc.next();
                for(int j=0;j<8;j++){
                    c[i][j]=s.charAt(j);
                }
            }
            for(int i=1;i<7;i++){
                for(int j=1;j<7;j++){
                    if(c[i][j]=='#' && c[i-1][j+1]=='#' && c[i-1][j-1]=='#' && c[i+1][j+1]=='#' && c[i+1][j-1]=='#'){
                        System.out.println((i+1)+" "+(j+1));
                        break;
                    }
                }
            }
        }
    }
}
