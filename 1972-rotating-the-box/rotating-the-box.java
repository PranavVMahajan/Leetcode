class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;

        // Create a new result array with dimensions swapped
        char[][] result = new char[n][m];

        // Transpose the box
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = box[j][i];
            }
        }

        // Reverse each row to achieve a 90-degree rotation
        for (int i = 0; i < n; i++) {
            reverseRow(result[i]);
        }

        // Apply gravity
        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                if (result[i][j] == '.') { // If it's a space
                    int stoneRow = -1;

                    // Look for the nearest stone above
                    for (int k = i - 1; k >= 0; k--) {
                        if (result[k][j] == '*') {
                            break; // Stop at an obstacle
                        } else if (result[k][j] == '#') {
                            stoneRow = k;
                            break;
                        }
                    }

                    if (stoneRow != -1) {
                        result[i][j] = '#';
                        result[stoneRow][j] = '.';
                    }
                }
            }
        }

        return result;
    }

    // Helper method to reverse a row
    private void reverseRow(char[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            char temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}
