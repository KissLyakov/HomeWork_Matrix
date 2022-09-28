public class Matrix {

    Double[][] matrix;
    int lineNum;
    int columnNum;

    public Matrix(int lineNum, int columnNum) {
        this.lineNum = lineNum;
        this.columnNum =columnNum;
        this.matrix = new Double[lineNum][columnNum];
    }

    //Заполнение матрицы
    public void fillMatrix(){
        for (int i = 0; i < (this.lineNum); i++){
            for (int j = 0; j < (this.columnNum); j++){
                this.matrix[i][j] = Math.random() * 11;
            }
        }
    }

    //Вывод матрицы
    public void printMatrix(){
        for (int i = 0; i < lineNum; i++){
            for (int j = 0; j < columnNum; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix sumMatrix(Matrix MatrixA, Matrix MatrixB){
        Matrix returnMatrix = new Matrix(2,2);
        for (int i = 0; i < lineNum; i++){
            for (int j = 0; j < columnNum; j++){
                returnMatrix.matrix[i][j] = MatrixA.matrix[i][j] + MatrixB.matrix[i][j];
            }
        }
        return returnMatrix;
    }

    public Matrix multiplicationByNumber(Matrix mulMatrix, int Number) {
        Matrix returnMatrix = new Matrix(2,2);
        for (int i = 0; i < mulMatrix.lineNum; i++) {
            for (int j = 0; j < mulMatrix.columnNum; j++) {
                returnMatrix.matrix[i][j] = mulMatrix.matrix[i][j] * Number;
            }
        }
        return returnMatrix;
    }
    //умножение я не осилил, снизу неудачная попытка
    public Matrix multiplicationByMatrix(Matrix mulMatrixA, Matrix mulMatrixB){
        Matrix returnMatrix = new Matrix(2,2);

        for (int i = 0; i < mulMatrixA.lineNum; i++){
            for (int j = 0; j < mulMatrixB.columnNum; j++){
                for(int k = 0; k < returnMatrix.columnNum; k++) {
                  returnMatrix.matrix[i][j] += (mulMatrixA.matrix[i][k] * mulMatrixB.matrix[k][j]);
                }
            }
        }
        return returnMatrix;
    }
}
