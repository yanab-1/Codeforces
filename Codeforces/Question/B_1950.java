
import java.util.Scanner;

public class B_1950 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int row=1;
            int s=n;
            while(row<=n){
                int num=2;
                while(num-->0){
                    if(row%2!=0){
                        int i=1;
                        while(s>=i){
                            if(i%2!=0){
                                System.out.print("##");
                            }
                            else{
                                System.out.print("..");
                            }
                            i++;
                        }
                        System.out.println();
                    }
                    else{
                        int i=1;
                        while(s>=i){
                            if(i%2!=0){
                                System.out.print("..");
                            }
                            else{
                                System.out.print("##");
                            }
                            i++;
                        }
                        System.out.println();
                    }
                }
                row++;
            }
        }
    }
}
