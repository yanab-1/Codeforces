
import java.util.Scanner;

public class D_1690 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int c=0;
            int j=0;
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='W'){
                    c++;
                }
                if(i-j+1==k){
                    ans=Math.min(ans,c);
                    if(s.charAt(j)=='W'){
                        c--;
                    }
                    j++;
                }
            }
            System.out.println(ans);
        }
    }
}
