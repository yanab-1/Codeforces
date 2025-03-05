import java.util.HashMap;
import java.util.Scanner;
 
public class C_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> set=new HashMap<>();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            if(!set.containsKey(s)){
                System.out.println("OK");
                set.put(s,1);
            }
            else{
                int c=set.get(s);
                String s1=s+c;
                while(set.containsKey(s1)){
                    c++;
                    s1=s+c;
                }
                set.put(s,c+1);
                set.put(s1,1);
                System.out.println(s1);
            }
        }
    }
}