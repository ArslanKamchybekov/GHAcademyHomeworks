package dsa.week1.recommended;



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
