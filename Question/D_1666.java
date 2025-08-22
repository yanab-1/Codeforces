
import java.util.Scanner;

public class D_1666 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String s=sc.next();
            String t=sc.next();
            int[] sfreq=new int[26];
            int[] tfreq=new int[26];
            for(char c:s.toCharArray()){
                sfreq[c-'A']++;
            }
            for(char c:t.toCharArray()){
                tfreq[c-'A']++;
            }
            boolean flag=false;
            int[] del=new int[26];
            for(int i=0;i<26;i++){
                if(sfreq[i]-tfreq[i]<0){
                    flag=true;
                    break;
                }
                del[i]=sfreq[i]-tfreq[i];
            }
            if(flag){
                System.out.println("NO");
                continue;
            }
            StringBuilder sb=new StringBuilder();
            for(char c:s.toCharArray()){
                if(del[c-'A']>0){
                    del[c-'A']--;
                }
                else{
                    sb.append(c);
                }
            }
            if(sb.toString().equals(t)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
