public class SubMatrix {
    public static void main(String[] args) {
        int r = 6;
        int c = 6;
        int si = 3, sj = 3;
        int[][] original = creatematrix(r, c) ;
        printmatrix(original, r, c);
        for (int i = 0; i < r-si+1; i++) {
            for (int j = 0; j < c-sj+1; j++) {
                int[][] res = submatrix(original, i, j);
                printmatrix(res, 3, 3);
            }
        }

    }
    public static int[][] creatematrix(int r, int c){
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
    public static int[][] submatrix(int[][] arr1, int r , int c){
        int[][] arr = new int[3][3];
        int i1 = 0;
        int j1 = 0;
        for (int i = r; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
              //  System.out.println(i + ", " + j);
                arr[i1][j1] = arr1[i][j];
                j1++;
            }
            j1 = 0;
            i1++;
        }
        return arr;
    }
    public static void printmatrix(int[][] arr1, int r , int k){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print( arr1[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
