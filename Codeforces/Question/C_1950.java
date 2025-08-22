import java.util.*;
public class C_1950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine();
        while(t-->0) {
            String time = sc.nextLine();
            String[] parts = time.split(":"); 
            int hh = Integer.parseInt(parts[0]);  
            String mm = parts[1]; 
            String period;
            if (hh == 0) {
                hh = 12; 
                period = "AM";
            } else if (hh == 12) {
                period = "PM"; 
            } else if (hh < 12) {
                period = "AM"; 
            } else {
                hh -= 12;
                period = "PM";
            }
            System.out.printf("%02d:%s %s\n", hh, mm, period);
        }

    }
}
