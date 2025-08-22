
import java.util.Scanner;

public class A_1881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();
            boolean flag=true;
            for(int i=0;i<6;i++){
                if(x.contains(s)){
                    System.out.println(i);
                    flag=false;
                    break;
                }
                x+=x;
            }
            if(flag){
                System.out.println(-1);
                
            }
        }
    }
}
