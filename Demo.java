public class Demo{

  public static void printLoop(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= (n-i); j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[]arr) {
    String ans = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i < arr.length - 1) {
        ans += (arr[i] + ", ");
      } else {
        ans += arr[i];
      }
    }
    ans += "}";
    return ans;
  }

  public static String arrayDeepToString(int[][]arr) {
    String ans = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i < arr.length - 1) {
        ans += (arrToString(arr[i]) + ", ");
      } else {
        ans += (arrToString(arr[i]));
      }
    }
    ans += "}";
    return ans;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = (int)(Math.floor(Math.random() * maxValue));
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      arr[i] = new int[(int)(Math.floor(Math.random() * cols))];
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int)(Math.floor(Math.random() * maxValue));
      }
    }
    return arr;
  }

  public static void main(String[]args){
    if (args.length == 0) {
      printLoop(5);
    } else {
      printLoop(Integer.parseInt(args[0]));
    }
    /*
    System.out.println(arrayDeepToString(create2DArrayRandomized(6,4,4)).replace("}, ","},\n "));
    System.out.println(arrayDeepToString(create2DArrayRandomized(4,10,100)).replace("}, ","},\n "));
    */
  }
}
