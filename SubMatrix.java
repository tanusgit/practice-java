import java.util.ArrayList;

public class SubMatrix {
    public static void main(String[] args) {
        int r = 6;
        int c = 6;
        int si = 3, sj = 3;
        int[][] original = creatematrix(r, c);
        printmatrix(original, r, c);
        //used this code to create AllMatrix
        for (int i = 0; i < r - si + 1; i++) {
            for (int j = 0; j < c - sj + 1; j++) {
                int[][] res = submatrix(original, i, j);
               // System.out.println("printing matrix ");
              //  printmatrix(res, 3, 3);
            }
        }

        //printing arraylist which consists matrix
       ArrayList<int[][]> a = AllMatrix(original, r, c, si,sj);
        for(int[][] res : a){
            System.out.println("printing matrix one by one");
            printmatrix(res, 3, 3);
            ArrayList<Integer> m = hourglass(res, 3, 3);
            System.out.println("printing hour glass one by one");
            printArraylist(m);
        }
    }

    public static int[][] creatematrix(int r, int c) {
        int[][] arr = new int[r][c];
        int count = 0;
        //create a matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = count++;
            }
        }
        return arr;
    }

    public static int[][] submatrix(int[][] arr1, int r, int c) {
        int[][] arr = new int[3][3];
        int i1 = 0;
        int j1 = 0;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                //  System.out.println(i + ", " + j);
                arr[i1][j1] = arr1[i][j];
                j1++;
            }
            j1 = 0;
            i1++;
        }
        return arr;
    }

    public static void printmatrix(int[][] arr1, int r, int k) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(arr1[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> hourglass(int[][] arr, int r, int c) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                int a = arr[i][j];
                if(i == 1 && (j == 0 || j == 2)){
                    break;
                }
                res.add(a);
            }
        }
        return res;
    }

    public static ArrayList<int[][]> AllMatrix(int[][] original, int r,
                                               int c, int si, int sj) {
        ArrayList<int[][]> a = new ArrayList<>();
        int[][] res = new int[3][3];
        for (int i = 0; i < r - si + 1; i++) {
            for (int j = 0; j < c - sj + 1; j++) {
                res = submatrix(original, i, j);
              //  System.out.println("printing matrix ");
              //  printmatrix(res, 3, 3);
            }
            a.add(res);
        }
        return a;
    }
 public static void printArraylist(ArrayList<Integer> m) {
        for(int a : m){
            System.out.print(a + " ");
        }
 }
}