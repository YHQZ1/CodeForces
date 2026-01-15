import java.util.Arrays;
import java.util.Scanner;
 
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
 
        // Split by '+'
        String[] parts = s.split("\\+");
 
        // Sort numbers lexicographically (safe since only 1,2,3)
        Arrays.sort(parts);
 
        // Rebuild result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (i > 0) result.append("+");
            result.append(parts[i]);
        }
 
        System.out.println(result.toString());
        sc.close();
    }
}