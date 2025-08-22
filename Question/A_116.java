import java.util.Scanner;

public class A_116 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int cap=0;
        for(int i=0;i<n;i++){
            int ex=sc.nextInt();
            int en=sc.nextInt();
            cap-=ex;
            cap+=en;
            if(cap>ans){
                ans=cap;
            }
        }
        System.out.println(ans);
    }
}