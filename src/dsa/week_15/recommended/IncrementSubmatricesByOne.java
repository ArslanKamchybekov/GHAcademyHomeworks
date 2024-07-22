package dsa.week_15.recommended;

class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] matrix = new int[n + 2][n + 2]; //to work around the out-of-bounds indices
        for(int[] query: queries) {
            int r1 = query[0] + 1, c1 = query[1] + 1;
            int r2 = query[2] + 1, c2 = query[3] + 1; //to make each query 1-indexed

            matrix[r1][c1] += 1;
            matrix[r2 + 1][c1] -= 1;
            matrix[r1][c2 + 1] -= 1;
            matrix[r2 + 1][c2 + 1] += 1;
        }
        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= n; c++){
                matrix[r][c] = matrix[r - 1][c] + matrix[r][c - 1] - matrix[r - 1][c - 1] + matrix[r][c];
            }
        }
        int[][] res = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res[i][j] = matrix[i + 1][j + 1];
            }
        }
        return res;
    }
}


// How I solved it before watching the lecture => O(n^3)
//class Solution {
//    public int[][] rangeAddQueries(int n, int[][] queries) {
//        int[][] matrix = new int[n][n];
//
//        for(int[] query: queries){
//            for(int i = query[0]; i <= query[2]; i++){
//                for(int j = query[1]; j <= query[3]; j++){
//                    matrix[i][j]++;
//                }
//            }
//        }
//        return matrix;
//    }
//}
