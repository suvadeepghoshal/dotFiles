import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Temp {
  static PrintStream out = System.out;

  public static void main(String[] args) {
    CustomScanner cs = new CustomScanner();
    int tc;
    // tc = cs.nextInt();
    tc = 1;
    for (int t = 0; t < tc; ++t) {
      runCase(cs);
    }
  }

  static void runCase(CustomScanner cs) {
    // TODO: Code here
  }

  static class CustomScanner {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    String next() {
      while (!st.hasMoreTokens())
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    float nextFloat() {
      return Float.parseFloat(next());
    }

    int[] sortInt(int[] a) {
      ArrayList<Integer> al = new ArrayList<>();
      for (int i : a)
        al.add(i);
      Collections.sort(al);
      return al.stream().mapToInt(i -> i).toArray();
    }

    String sortString(String s) {
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      return new String(chars);
    }
  }

}
