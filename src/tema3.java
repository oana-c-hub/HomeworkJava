public class tema3 {
    public static void main(String[] args) {
//  Print reverse secondary diagonal: 7 5 3

        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] firstArray = matrix[0]; // {1, 2, 3}
        int[] secondArray = matrix[1]; // {4, 5, 6}
        int[] thirdArray = matrix[2]; // {7, 8, 9}

//  Model: first diagonal elements within a matrix
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j) {
//                    System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);

        int n = matrix.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(matrix[i][n - 1 - i] + " ");

                }
            }
        }
