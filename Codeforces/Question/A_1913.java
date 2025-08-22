
import java.util.Scanner;

public class A_1913 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String ab=sc.next();
            boolean flag=false;
            for(int i=1;i<ab.length();i++){
                String a=ab.substring(0,i);
                String b=ab.substring(i,ab.length());
                if(!b.startsWith("0") && Integer.parseInt(a)<Integer.parseInt(b)){
                    System.out.println(a+" "+b);
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println("-1");
            }
        }
    }
}
