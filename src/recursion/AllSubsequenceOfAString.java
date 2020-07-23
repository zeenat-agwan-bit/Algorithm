package recursion;

import java.util.*;

public class AllSubsequenceOfAString {
    static Set<String>set=new HashSet<>();
    
//for output till
  public static void  printSubSequences(String input, String outputSofar) {
   if(input.length()==0){
       if(set.contains(outputSofar)) return;
       set.add(outputSofar);
       System.out.println(outputSofar);
       return;
   } 
   
   //we chose to exclude the first character
      printSubSequences(input.substring(1),outputSofar);
       //we chose to include the first character
      printSubSequences(input.substring(1),outputSofar+input.charAt(0));
    }

    public static void printSubSequences(String input) {
   printSubSequences(input,"");
    }

    public static void main(String[] args) {
     
        printSubSequences("xyz");
    }
}
