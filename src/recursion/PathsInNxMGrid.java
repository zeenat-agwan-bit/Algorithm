//find all the paths in a nxm grid
package recursion;
public class PathsInNxMGrid {
    static int path(int n,int m){ //rows and column
         if(n==1 || m==1)return 1;
    return path(n,m-1)+path(m,n-1);
    }
    public static void main(String[] args) {
        System.out.println(path(4, 2));
           System.out.println(path(200, 1));
        
    }
}
