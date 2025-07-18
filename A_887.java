
import java.util.Scanner;

public class A_887 {                                                                                              
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        String s=sc.next();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                int z=0;
                for(int j=i+1;j<n;j++){
                    if(s.charAt(j)=='0'){
                        z++;
                    }
                }
                if(z>=6){
                    System.out.println("yes");
                    return;
                }
            }
        }
        System.out.println("no");
    }
}
