import java.util.Scanner;
public class C_1374 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int b=0;
            int m=0;
            for(char c:s.toCharArray()){
                if(c=='('){
                    b++;
                }
                else{
                    b--;
                }
                if(b<0){
                    m++;
                    b=0;
                }
            }
            System.out.println(m);
        }
    }
}
