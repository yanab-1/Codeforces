import java.util.*;
public class A_2062 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            sc.nextLine();
            int c=0;
            for(char i:s.toCharArray()){
                if(i=='1'){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
