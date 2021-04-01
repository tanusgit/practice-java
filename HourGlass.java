public class HourGlass {
    public static void main(String[] args) {
        int[][] original = SubMatrix.creatematrix(6, 6);
        int res = hourglass(original);
        System.out.println(res);

    }

    public static int hourglass(int[][] a){
        int s = Integer.MIN_VALUE ;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j< 4; j++){
                int m = a[i][j] + a[i][j] + a[i][j] + a[i+1][j+1] + a[i+2][j] + a[i+2][j]
                +a[i+2][j+1]+a[i+2][j+2];
                if (m > s){
                    s = m;
                }
            }
        }
        return s;
    }
}
