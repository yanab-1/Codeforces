import java.util.Scanner;

public class B_266{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        for(int i=0;i<t;i++){
            for(int j=0;j<n-1;j++){
                if(c[j]=='B' && c[j+1]=='G'){
                    c[j]='G';
                    c[j+1]='B';
                    j++;
                }
            }
        }
        System.out.println(new String(c));
    }
}