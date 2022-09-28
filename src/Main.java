public class Main {
    public static void main(String[] args) {
        Matrix MatrixA = new Matrix(2,2);
        MatrixA.fillMatrix();
        System.out.println("Матрица А: ");
        MatrixA.printMatrix();
        Matrix MatrixB = new Matrix(2,2);
        MatrixB.fillMatrix();
        System.out.println("Матрица B: ");
        MatrixB.printMatrix();

        Matrix MatrixS = new Matrix(2,2).sumMatrix(MatrixA,MatrixB);
        System.out.println("Итог сложения матриц А и В - Матрица S: ");
        MatrixS.printMatrix();

        Matrix MatrixM = new Matrix(2,2).multiplicationByNumber(MatrixA,5);
        System.out.println("Итог умножения матрицы А на число - Матрица М: ");
        MatrixM.printMatrix();
    }
}