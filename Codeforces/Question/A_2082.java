
import java.util.Scanner;

public class A_2082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] row=new int[n];
            int[] col=new int[m];
            for(int i=0;i<n;i++){
                String s=sc.next();
                for(int j=0;j<m;j++){
                    int x=s.charAt(j)-'0';
                    row[i]^=x;
                    col[j]^=x;
                }
            }
            int oddrow=0;
            int oddcol=0;
            for(int i=0;i<n;i++){
                if(row[i]==1){
                    oddrow++;
                }
            }
            for(int i=0;i<m;i++){
                if(col[i]==1){
                    oddcol++;
                }
            }
            System.out.println(Math.max(oddcol,oddrow));
        }
    }
}
