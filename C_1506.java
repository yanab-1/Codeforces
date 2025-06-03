
import java.util.Scanner;

public class C_1506 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            int n=a.length();
            int m=b.length();
            int ans=0;
            for(int len=1;len<=Math.min(n,m);len++){
                for(int i=0;i+len<=n;i++){
                    String a1=a.substring(i,i+len);
                    for(int j=0;j+len<=m;j++){
                        String b1=b.substring(j,j+len);
                        if(a1.equals(b1)){
                            ans=Math.max(ans,len);
                        }
                    }
                }
            }
            System.out.println(n+m-2*ans);
        }
    }
}
