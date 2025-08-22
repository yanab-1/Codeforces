import java.util.Scanner;

public class B_1820 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        String s=sc.next();
        s=s+s;
        int c=0;
        int one=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
                c=Math.max(one,c);
            }
            else{
                one=0;
            } 
        }
        int n=s.length()/2;
        if(c>n){
            System.out.println(1L*n*n);
        }
        else{
            System.out.println(((long)(c+1)/2)*((c+2)/2));
        }
    }
}
