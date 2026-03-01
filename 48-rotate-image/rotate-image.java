class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans[][] = new int[m][n];
        int idxc = 0;
        for (int i = 0; i < m; i++) {
            int idxr = m - 1;
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[idxr][idxc];
                idxr--;
            }
            idxc++;

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ans[i][j];

            }
        }

    }

}
