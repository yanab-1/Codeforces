import java.util.Scanner;

public class tech_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            String s = sc.nextLine();
            String s1 = s.substring(0, 2); 
            int i = Integer.parseInt(s1);
            
            if (i > 12) {
                System.out.println(String.format("%02d", i - 12) + s.substring(2) + " PM");
            } else if (i == 12) {
                System.out.println(s + " PM");
            } else if (i == 0) { 
                System.out.println("12" + s.substring(2) + " AM");
            } else {
                System.out.println(s + " AM");
            }
        }
    }
}
