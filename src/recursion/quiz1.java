/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author YUSUF AGWAN
 */
public class quiz1 {
    static void fun1(int n)  
{  
   int i = 0;    
   if (n > 1)  
     fun1(n - 1);  
   for (i = 0; i < n; i++)  
     System.out.print(" * ");  
}  
    public static void main(String[] args) {
        int n=2;
       fun1(n);
    }
}
