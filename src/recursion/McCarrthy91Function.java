
package recursion;
/*
The McCarthy 91 function is defined as :
M(n)  =    n-10               ,  if n>100
                M(M(n+11)) ,  if n<=100
*/
public class McCarrthy91Function {
    static int fun(int n) 
    { 
        if (n > 100) 
            return n - 10; 
        return fun(fun(n+11)); 
    } 
      
    public static void main (String[] args) { 
        System.out.println(" " + fun(99) + " "); 
    } 
}
