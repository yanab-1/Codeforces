
import java.util.*;

public class A_118 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='y' || c=='Y'){
                continue;
            }
            res.append("."+Character.toLowerCase(c));
        }
        System.out.println(res.toString());
    }
}
