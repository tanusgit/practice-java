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
        ArrayList<Integer> sumofallhourglass = new ArrayList<>();
        for(int[][] res : a){
            //System.out.println("printing matrix one by one");
           // printmatrix3(res);
           ArrayList<Integer> m = hourglass(res, 3, 3);
           //System.out.println("printing hour glass one by one");
           //printArraylist(m);
            int finalres = Sumhourglass(m);
            sumofallhourglass.add(finalres);
        }
        int big = 0;
        for(int res : sumofallhourglass) {
            if(res > 0){
                big = res;
            }
        }
        System.out.println("the biggest number " + big);



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
        int a = 0;
        int b = arr[1][1];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if( (i ==1 && (j == 0 || j == 2 ))){
                    break;
                }
                a = arr[i][j];
                res.add(a);
            }
        }
        res.add(b);
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
                a.add(res);
            }

        }
        return a;
    }
 public static void printArraylist(ArrayList<Integer> m) {
        for(int a : m){
            System.out.print(a + " ");
        }
 }

    public static void printmatrix3(int[][] arr1) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static int Sumhourglass(ArrayList<Integer> arr) {
        int res = 0;
        for(int i = 0; i < arr.size()-1; i++){
            res = res + arr.get(i);
            }
        return res;
        }

    }
