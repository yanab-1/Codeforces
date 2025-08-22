
import java.util.Scanner;

public class C_1744{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            char c=sc.next().charAt(0);
            String s=sc.next();
            s=s+s;
            if(c=='g'){
                System.out.println(0);
                continue;
            }
            int ans=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)==c){
                    int j=i;
                    while(s.charAt(i)!='g'){
                        i++;
                    }
                    ans=Math.max(ans,i-j);
                }
            }
            System.out.println(ans);
        }
    }
}