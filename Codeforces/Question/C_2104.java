
import java.util.ArrayList;
import java.util.Scanner;

public class C_2104 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if(n==2){
                if(s.equals("AB")){
                    System.out.println("Alice");
                }
                else{
                    System.out.println("Bob");
                }
                continue;
            }
            ArrayList<Integer> alice=new ArrayList<>();
            ArrayList<Integer> bob=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='A'){
                    alice.add(i+1);
                }
                else{
                    bob.add(i+1);
                }
            }
            boolean a=false;
            for(int i:alice){
                boolean b=true;
                for(int j:bob){
                    if(!beats(i,j,n)){
                        b=false;
                        break;
                    }
                }
                if(b){
                    a=true;
                    break;
                }
            }
            if(a){
                System.out.println("Alice");
            
            }
            else{
                System.out.println("Bob");
            }
        }
    }
    private static boolean beats(int x, int y, int n) {
        if (x == 1 && y == n) {
            return true;
        }
        return x > y && !(x == n && y == 1);
    }
}
