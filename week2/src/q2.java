public class q2 {
    public static void main(String[] args) {
    int[][] matrix = {
            {-1, 2, 3, 4, -1},
            {6, -1, 8, -1, 10},
            {11, 12, -1, 14, 15},
            {16, -1, 18, -1, 20},
            {-1, 22, 23, 24, -1}
    };

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[i][j] != -1) {
                System.out.printf("%3d ", matrix[i][j]);
            } else {
                System.out.print(" * ");
            }
        }
        System.out.println();
    }
}
}
