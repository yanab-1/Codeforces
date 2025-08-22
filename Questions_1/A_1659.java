
import java.util.Scanner;

public class A_1659 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int r=sc.nextInt();
            int b=sc.nextInt();
            int base=r/(b+1);
            int ex=r%(b+1);
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<ex;i++){
                for(int j=0;j<base+1;j++){
                    sb.append('R');
                }
                sb.append('B');
            }
            for(int i=ex;i<b;i++){
                for(int j=0;j<base;j++){
                    sb.append('R');
                }
                sb.append('B');
            }
            for(int j=0;j<base;j++){
                sb.append('R');
            }
            System.out.println(sb.toString());
        }
    }
}
