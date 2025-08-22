import java.util.Scanner;

public class A_2094{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] arr=s.split(" ");
            StringBuilder sb=new StringBuilder();
            for (String arr1 : arr) {
                sb.append(arr1.charAt(0));
            }
            System.out.println(sb.toString());
        }
    }
}