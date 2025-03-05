import java.util.Scanner;

public class B_1722 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            boolean id=true;
            for(int i=0;i<n;i++){
                char c1=s1.charAt(i);
                char c2=s2.charAt(i);
                if(!((c1=='R' && c2=='R')||(c1!='R' && c2!='R'))){
                    id=false;
                    break;
                }
            }
            if(id){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
