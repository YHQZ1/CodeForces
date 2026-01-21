import java.util.Scanner;
import java.util.HashMap;
 
public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> map = new HashMap<>();
 
    int size = sc.nextInt();
    int[] towers = new int[size];
 
    for (int i = 0; i < size; i++) {
      towers[i] = sc.nextInt();
    }
 
    for (int i = 0; i < size; i++) {
      map.put(towers[i], map.getOrDefault(towers[i], 0) + 1);
    }
 
    int towerCount = map.size();
    int maxHeight = Integer.MIN_VALUE;
 
    for (Integer value : map.values()) {
      maxHeight = Math.max(maxHeight, value);
    }
 
    System.out.println(maxHeight + " " + towerCount);
 
    sc.close();
  }
}