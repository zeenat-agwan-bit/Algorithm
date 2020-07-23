package recursion;

public class FloodFill {
    //toFill-what to fill

    public static void floodFill(int a[][], int r, int c, int toFill, int preFill) {
        int rows = a.length;
        int col = a[0].length;
        //base condition
        if (r < 0 || r >= rows || c < 0 || c >= col) {
            return;
        }
        //base condition (check pre color )
        if (a[r][c] != preFill) {
            return;
        }
        //fill color
        a[r][c] = toFill;
        floodFill(a, r - 1, c, toFill, preFill);//right
        floodFill(a, r, c - 1, toFill, preFill);//left
        floodFill(a, r + 1, c, toFill, preFill);//bottom
        floodFill(a, r, c + 1, toFill, preFill);//top
       

    }
static void printMatrix(int a[][]){
//System.out.println(a[r][c]);
}
    
    public static void main(String[] args) {
        int a[][]
                = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1}
                };
     floodFill(a, 4, 3, 3, 2);
       printMatrix(a);
    }
}
