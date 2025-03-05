
import java.util.Scanner;

public class A_131 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.toUpperCase().equals(s) || (Character.isLowerCase(s.charAt(0)) && s.substring(1).toUpperCase().equals(s.substring(1)))){
            System.out.println(toggle(s));
        }
        else{
            System.out.println(s);
        }
    }
    public static String toggle(String s){
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            res.append(Character.isUpperCase(c) ? Character.toLowerCase(c):Character.toUpperCase(c));
        }
        return res.toString();
    }
}
