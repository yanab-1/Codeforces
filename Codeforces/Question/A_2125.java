import java.util.Scanner;

public class A_2125 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        String s=sc.next();
        int n=s.length();
        int t=0;
        for(char c:s.toCharArray()){
            if(c=='T'){
                t++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<t;i++){
            sb.append('T'); 
        }
        for(char c:s.toCharArray()){
            if(c!='T'){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
