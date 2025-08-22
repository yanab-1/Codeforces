import java.util.Scanner;

public class A_219 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int[] a=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]%k!=0){
                System.out.println(-1);
                return;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            for(int j=0;j<a[i]/k;j++){
                sb.append((char)(i+'a'));
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(sb.toString());
        }           
    }
}
