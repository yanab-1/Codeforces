
import java.util.Scanner;

public class A_1926 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int cA=0,cB=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='A'){
                    cA++;
                }
                else{
                    cB++;
                }
            }
            if(cA>cB){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        } 
    }
}
