import java.util.Scanner;

public class A_344 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s1=sc.nextLine();
        int ans=1;
        for(int i=1;i<n;i++){
            String s2=sc.nextLine();
            if(!s1.equals(s2)){
                ans++;
            }
            s1=s2;
        }
        System.out.println(ans);
    }
}
