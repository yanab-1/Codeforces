import java.util.Scanner;

public class A_1907 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            char c=s.charAt(0);
            int a=s.charAt(1)-'0';
            for(int i=1;i<=8;i++){
                if(a==i){
                    continue;
                }
                System.out.println(c+""+i);
            }
            for(char i='a';i<='h';i++){
                if(i==c){
                    continue;
                }
                System.out.println(i+""+a);
            }
        }
    }
}
