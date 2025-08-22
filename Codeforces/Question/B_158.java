
import java.util.Scanner;

public class B_158 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int g1=0;
        int g2=0;
        int g3=0;
        int c=0;
        for(int i=0;i<n;i++){
            int arr=sc.nextInt();
            if(arr==1){
                g1++;
            }
            else if(arr==2){
                g2++;
            }
            else if(arr==3){
                g3++;
            }
            else{
                c++;
            }
        }
        int ans=0;
        ans+=c;
        int t13=Math.min(g1,g3);
        ans+=t13;
        g1-=t13;
        g3-=t13;
        ans+=g3;
        ans+=g2/2;
        if(g2%2!=0){
            ans++;
            g1-=Math.min(g1,2);
        }
        if(g1>0){
            ans+=(g1+3)/4;
        }
        System.out.println(ans);
    }
}
