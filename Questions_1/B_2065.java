
import java.util.Scanner;

public class B_2065 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            boolean flag=true;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    System.out.println(1);
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(s.length());
            }
        }
    }
}
