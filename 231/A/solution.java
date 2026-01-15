import java.util.Scanner;
 
public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int size = sc.nextInt();
 
    int[][] problems = new int[size][3];
 
    for (int i = 0; i < problems.length; i++) {
      for (int j = 0; j < 3; j++) {
        problems[i][j] = sc.nextInt();
      }
    }
 
    int yes = 0;
 
    for (int i = 0; i < problems.length; i++) {
      int sum = problems[i][0] + problems[i][1] + problems[i][2];
      if (sum > 1)
        yes++;
    }
 
    System.out.println(yes);
  }
}