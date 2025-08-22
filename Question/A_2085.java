
import java.util.Scanner;

public class A_2085 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            StringBuilder rev=new StringBuilder(s).reverse();
            if(s.compareTo(rev.toString())<0){
                System.out.println("Yes");
            }
            else{
                if(k==0){
                    System.out.println("no");
                }
                else if(same(s)){
                    System.out.println("no");
                }
                else{
                    System.out.println("yes");
                }
            }
        }
    }
    public static boolean same(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}
