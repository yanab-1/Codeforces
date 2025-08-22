import java.util.Scanner;

public class B_1837 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=1;
            int ans=1;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    c++;
                }
                else{
                    c=1;
                }
                ans=Math.max(ans,c);
            }
            System.out.println(ans+1);
        }
    }
}
