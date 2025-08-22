
import java.util.Scanner;

public class B_1883{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int[] freq=new int[26];
            for(int i=0;i<n;i++){
                freq[s.charAt(i)-'a']++;
            }
            int c=0;
            for(int i:freq){
                if(i%2!=0){
                    c++;
                }
            }
            if(c-k>1){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}