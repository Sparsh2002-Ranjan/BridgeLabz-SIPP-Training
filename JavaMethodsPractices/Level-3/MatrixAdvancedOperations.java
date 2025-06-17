import java.util.Scanner;

public class MatrixAdvancedOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (2 or 3): ");
        int size = sc.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 and 3x3 matrices are supported.");
            return;
        }

        double[][] matrix = generateMatrix(size, size);
        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        double[][] transpose = transpose(matrix);
        System.out.println("\nTranspose:");
        displayMatrix(transpose);

        double det = determinant(matrix);
        System.out.println("\nDeterminant: " + det);

        if (det != 0) {
            double[][] inverse = inverse(matrix);
            System.out.println("\nInverse:");
            displayMatrix(inverse);
        } else {
            System.out.println("\nInverse not possible (determinant is zero).");
        }

        sc.close();
    }

    public static double[][] generateMatrix(int rows, int cols) {
        double[][] mat = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = Math.round(Math.random() * 10); 
        return mat;
    }

    public static double[][] transpose(double[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = mat[i][j];
        return trans;
    }

    public static double determinant(double[][] mat) {
        int n = mat.length;
        if (n == 2) {
            return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
        } else if (n == 3) {
            return mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1]) -
                   mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0]) +
                   mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
        }
        return 0;
    }

    public static double[][] inverse(double[][] mat) {
        int n = mat.length;
        double det = determinant(mat);
        if (det == 0) return new double[n][n];

        double[][] inv = new double[n][n];

        if (n == 2) {
            inv[0][0] =  mat[1][1] / det;
            inv[0][1] = -mat[0][1] / det;
            inv[1][0] = -mat[1][0] / det;
            inv[1][1] =  mat[0][0] / det;
        } else if (n == 3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    double minor = minor(mat, i, j);
                    inv[j][i] = Math.pow(-1, i + j) * minor / det;
                }
            }
        }

        return inv;
    }

    public static double minor(double[][] mat, int row, int col) {
        double[][] temp = new double[2][2];
        int r = 0, c;
        for (int i = 0; i < 3; i++) {
            if (i == row) continue;
            c = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col) continue;
                temp[r][c] = mat[i][j];
                c++;
            }
            r++;
        }
        return determinant(temp);
    }

    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.print(Math.round(val * 100.0) / 100.0 + "\t");
            System.out.println();
        }
    }
}
