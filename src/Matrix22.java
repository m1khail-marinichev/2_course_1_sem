import java.util.Arrays;

public class Matrix22 {
    public static void main(String[] args) {
        Matrix22 Matrix = new Matrix22(1, 2, 3, 4);
        //Matrix.print();
        Matrix22 Matrix_1 = new Matrix22(new int[][]{{1, 2}, {3, 4}});
        Matrix_1.print();
        Matrix.sled(matrix[0][0],
    }
    public int[][] matrix = new int[2][2];


    public Matrix22(int a, int b, int c, int d) {
        this.matrix[0][0] = a;
        this.matrix[0][1] = b;
        this.matrix[1][0] = c;
        this.matrix[1][1] = d;
    }
    public Matrix22(int[][] matrix) {
        this.matrix[0][0] = matrix[0][0];
        this.matrix[0][1] = matrix[0][1];
        this.matrix[1][0] = matrix[1][0];
        this.matrix[1][1] = matrix[1][1];

    }

    public void sled(int a, int d){
        System.out.println(a + d);
    }

    public void print() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++)
                System.out.print(this.matrix[i][j] + " ");
        }
    }
}
