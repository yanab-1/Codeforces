import java.util.HashMap;
import java.util.Scanner;

public class B_499 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        HashMap<String,String> lang=new HashMap<>();
        for(int i=0;i<m;i++){
            String[] words=sc.nextLine().split(" ");
            String f=words[0];
            String l=words[1];
            lang.put(f,l);
        }
        String[] lec=sc.nextLine().split(" ");
        StringBuilder res=new StringBuilder();
        for(String s:lec){
            String s2=lang.get(s);
            if(s.length()>s2.length()){
                res.append(s2).append(" ");
            }
            else{
                res.append(s).append(" ");
            }
        }
        System.out.println(res.toString().trim());
    }
}
