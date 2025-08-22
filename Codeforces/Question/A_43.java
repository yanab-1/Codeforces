import java.util.Scanner;

public class A_43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int c=0;
        String ans="";
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            if(c==0){
                ans=s;
                c++;
            }
            else if(s.equals(ans)){
                c++;
            }
            else{
                c--;
            }
        }
        System.out.println(ans);
    }
}
