import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows for the matrices: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns for the matrices: ");
        int cols = sc.nextInt();

        int[][] matrixA = generateMatrix(rows, cols);
        int[][] matrixB = generateMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        int[][] sum = addMatrices(matrixA, matrixB);
        int[][] diff = subtractMatrices(matrixA, matrixB);
        int[][] product = multiplyMatrices(matrixA, matrixB);

        System.out.println("\nAddition (A + B):");
        displayMatrix(sum);

        System.out.println("\nSubtraction (A - B):");
        displayMatrix(diff);

        System.out.println("\nMultiplication (A * B):");
        displayMatrix(product);

        sc.close();
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = (int)(Math.random() * 10); 
        return mat;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = a[i][j] + b[i][j];
        return sum;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                diff[i][j] = a[i][j] - b[i][j];
        return diff;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int r1 = a.length, c1 = a[0].length;
        int r2 = b.length, c2 = b[0].length;

        if (c1 != r2) {
            System.out.println("Multiplication not possible: columns of A != rows of B");
            return new int[0][0];
        }

        int[][] prod = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    prod[i][j] += a[i][k] * b[k][j];

        return prod;
    }

    public static void displayMatrix(int[][] mat) {
        if (mat.length == 0) {
            System.out.println("Empty matrix");
            return;
        }

        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
}
