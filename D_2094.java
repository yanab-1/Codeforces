import java.util.Scanner;

public class D_2094 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String p=sc.next();
            String s=sc.next();
            if(p.equals(s)){
                System.out.println("YES");
            }
            else{
                int i=0;
                int j=0;
                boolean flag=false;
                while(i<p.length() && j<s.length()){
                    if(p.charAt(i)!=s.charAt(j)){
                        System.out.println("NO");
                        flag=true;
                        break;
                    }
                    int c1=1;
                    while(i+1<p.length() && p.charAt(i)==p.charAt(i+1)){
                        c1++;
                        i++;
                    }
                    int c2=1;
                    while(j+1<s.length() && s.charAt(j)==s.charAt(j+1)){
                        j++;
                        c2++;
                    }
                    if(c1*2<c2 || c1>c2){
                        System.out.println("NO");
                        flag=true;
                        break;
                    }
                    i++;
                    j++;
                }
                if(!flag){
                    if(i==p.length() && j==s.length()){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
