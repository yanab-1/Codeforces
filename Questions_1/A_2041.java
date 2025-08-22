import java.util.Scanner;

public class A_2041 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int res=0;
            for(int i=0;i<4;i++){
                int a=sc.nextInt();
                res+=a;
            }
            res=15-res;
            System.out.println(res); 
    }
}
