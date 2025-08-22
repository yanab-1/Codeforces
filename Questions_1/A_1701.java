
import java.util.Scanner;

public class A_1701 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[][] a=new int[2][2];
            int c=0;
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    a[i][j]=sc.nextInt();
                    if(a[i][j]==1){
                        c++;
                    }
                }
            }
            switch (c) {
                case 4 -> System.out.println(2);
                case 0 -> System.out.println(0);
                default -> System.out.println(1);
            }
        }
    }
}
