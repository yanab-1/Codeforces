
import java.util.Scanner;

public class A_2118{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            solve(n,k);
        }
    }

    public static void solve(int n,int k){
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            if(i<k){
                ans.append("1");
            }
            else{
                ans.append("0");
            }
        }
        System.out.println(ans.toString());
    }
}