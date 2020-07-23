package recursion;

public class ReverseAString {

    static void reverse(String str) {
        //base condition
        if ((str == null) || (str.length() <= 1)) {
            System.out.println(str);
        } else {
            //last element excludes in the case of substring so
            System.out.print(str.substring(str.length() - 1)); //print last element 
            reverse(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
 String str = "world is beautiful"; 
        reverse(str);
    }
}
//TC O(n)

