import java.util.Arrays;

public class spiral {

    public static void spiral(int matrix[][]) {

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++)
                System.out.print(matrix[top][i]+" ");
            top++;

            for(int i=top;i<=bottom;i++)
                System.out.print(matrix[i][right]+" ");
            right--;

            for (int i = right; i >= left; i--)
                System.out.print(matrix[bottom][i]+" ");
            bottom--;

            for (int i = bottom; i >= top; i--)
                System.out.print(matrix[i][left]+" ");
            left++;
        }
    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // System.out.println(Arrays.deepToString(matrix));

        spiral(matrix);

    }
}