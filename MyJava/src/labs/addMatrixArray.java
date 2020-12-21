package labs;

public class addMatrixArray {

    public static void main(String[] args) {

        int[][] a = {{2,3,4},{45,6,7}};
        int[][] b = {{1,2,3},{3,2,1}};

        int[][] c = new int[2][2];

        for (int i=0;i<a.length; i++){
            for (int j=0; j<b.length; j++){

                c[i][j]= a[i][j]+b[i][j];
                System.out.print(c[i][j]);

            }
        }
    }
}
