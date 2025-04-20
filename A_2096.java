import java.util.Scanner;

public class A_2096 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            int r=n;
            int l=1;
            int[] ans=new int[n];
            for(int i=n-1;i>0;i--){
                if(s.charAt(i-1)=='<'){
                    ans[i]=l++;
                }
                else{
                    ans[i]=r--;
                }
            }
            ans[0]=l;
            for(int i:ans){
                System.out.print(i+" ");
            }
        }
    }
}
