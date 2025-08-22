import java.util.Scanner;

public class A_1900 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int c=0;
            int con=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='.'){
                    c++;
                    con++;
                }
                else{
                    con=0;
                }
                if(con>=3){
                    System.out.println(2);
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println(c);
            }
        }
    }
}
