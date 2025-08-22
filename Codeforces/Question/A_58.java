
import java.util.Scanner;

public class A_58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="hello";
        int ind=0;
        boolean Valid=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==res.charAt(ind)){
                ind++;
            }
            if(ind==5){
                Valid=true;
                break;
            }
        }
        if(Valid){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
