class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int rowidx[] = new int[n];
        int colsidx[] = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rowidx[i] = 1;
                    colsidx[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rowidx[i] == 1 && colsidx[j] == 1) {
                    for (int idx = 0; idx < m; idx++) {
                        matrix[i][idx] = 0;
                    }
                    for (int idx = 0; idx < n; idx++) {
                        matrix[idx][j] = 0;
                    }
                }

            }
        }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         matrix[i][j] = ans[i][j];
        //         // i1++;
        //         // i2++;

        //     }
        // }

    }
}