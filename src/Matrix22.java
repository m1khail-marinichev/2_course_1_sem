import java.util.Arrays;

public class Matrix22 {
    public static void main(String[] args) {
        Matrix22 Matrix = new Matrix22(1, 2, 3, 4);
        Matrix22 Matrix_1 = new Matrix22(new double[][]{{5, 6}, {7, 8}});
        Matrix.arrayFromMatrix = Matrix.get();
        Matrix.print();
        Matrix_1.arrayFromMatrix = Matrix_1.get();
        Matrix_1.print();
        System.out.println(Matrix.det());
        System.out.println(Matrix.trace());
        Matrix.getArray();
        System.out.println(Matrix.toString());
        Matrix.printMatrix();
        Matrix.arrayFromMatrix = Matrix.add(new Matrix22(5, 6, 7, 8));
        Matrix.print();
        System.out.println("---------------------");
        Matrix22 matr = new Matrix22(1, 2, 3, 4);
        matr = matr.mul(new Matrix22(5, 6, 7, 8));
        matr = matr.mul(new Matrix22(5, 6, 7, 8));
        matr.arrayFromMatrix = matr.get();
        matr.print();

    }

    double a;
    double b;
    double c;
    double d;
    public double[][] arrayFromMatrix = new double[2][2];


    public Matrix22(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Matrix22(double[][] matrix) {
        this.a = matrix[0][0];
        this.b = matrix[0][1];
        this.c = matrix[1][0];
        this.d = matrix[1][1];

    }
    public double[][] get() {
        double[][] matrix = new double[][]{{a,b},{c, d}};
        return matrix;
    }
    public double det() {
        return (this.a * this.d - this.b * this.c);
    }

    public double trace() {
        return (this.a + this.d);
    }

    public void print() {
        for (int i = 0; i < this.arrayFromMatrix.length; i++) {
            for (int j = 0; j < this.arrayFromMatrix[i].length; j++)
                System.out.print(this.arrayFromMatrix[i][j] + " ");
        }
        System.out.println(' ');
    }

    public void getArray() {
        double[][] newArray = get();
        newArray[0][1] = 7;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++)
                System.out.print(newArray[i][j] + " ");
        }
        System.out.println(' ');
    }

    public String toString() {
        double[][] matrix = get();
        String arr = "Array: ";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                arr = arr + "" + matrix[i][j] + " ";
        }
        return arr;
    }

    public void printMatrix() {
        double[][] matrix = get();
        System.out.println(matrix[0][0] + " " + matrix[0][1]);
        System.out.println(matrix[1][0] + " " + matrix[1][1]);
    }

    public double[][] add(Matrix22 b) {
        double[][] matrix = get();
        matrix[0][0] += b.arrayFromMatrix[0][0];
        matrix[0][1] += b.arrayFromMatrix[0][1];
        matrix[1][0] += b.arrayFromMatrix[1][0];
        matrix[1][1] += b.arrayFromMatrix[1][1];
        return matrix;
    }


    public Matrix22 mul(Matrix22 b) {
        double[][] matrix = this.get();
        double[][] result = new double[2][2];
        result[0][0] = matrix[0][0] * b.a;
        result[0][1] = matrix[0][1] * b.b;
        result[1][0] = matrix[1][0] * b.c;
        result[1][1] = matrix[1][1] * b.d;
        Matrix22 matr = new Matrix22(result[0][0], result[0][1], result[1][0], result[1][1]);
        return matr;
    }
}
