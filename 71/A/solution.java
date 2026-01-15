import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Solution {
 
  private static String convert(String s) {
    int len = s.length();
    if (len > 10) {
      return "" + s.charAt(0) + (len - 2) + s.charAt(len - 1);
    }
    return s;
  }
 
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
 
    for (int i = 0; i < n; i++) {
      System.out.println(convert(br.readLine()));
    }
  }
}