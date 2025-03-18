
import java.util.Scanner;

public class B_1913 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int c1=0;
            int c0=0;
            for(char c:s.toCharArray()){
                if(c=='1'){
                    c1++;
                }else{
                    c0++;
                }
            }
            if(c1==c0){
               System.out.println(0);
            }
            else{
                int co=0;
                for(char c:s.toCharArray()){
                    if(c=='1' && c0>0){
                        c0--;
                        co++;
                    }
                    else if(c=='0' && c1>0){
                        c1--;
                        co++;
                    }
                    else{
                        System.out.println(s.length()-co);
                        break;
                    }
                }
            }
        }
    }
}
