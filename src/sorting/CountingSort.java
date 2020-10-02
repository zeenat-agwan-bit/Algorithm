package sorting;
//doesn't make comparisons for sorting.
//to sort keys(n) we have to assume a range(k).
import java.util.Arrays;

//consider an temp array and create blocks according to the range to check  frequency of keys.Move from left to right and counts the occurance of keys.
//write down the keys according to there occurrences but in sequential manner.ex:1 1 2 2 3 3 3 6 6 9
//O(n+k) where k should be O(n).It cant be O(n2).that cause of unnecessary occurances of Zeros.
//ex: 1 2 400 5 6 where k=400 (wastage of resource)
//it cant be applied if the values are different in any range.(for this Radix sort)
//keys cant be less than 1 and greater than range(max).It should be within its range.
//this algo cant works directly for negative ,string or floating point values.

public class CountingSort {
    public static void main(String[] args) {
        int[] input = {2,5,9,8,2,7,10,4,8};
      //  countingSort(input ,min: 1,max: 2);
        countingSort(input, 1,10); //input and range
        Arrays.stream(input).forEach(x->System.out.print(x + " ")); //here forEach is a method
    }
    private static void countingSort(int[] input, int min ,int max){
         int[] countingArray=new int [(max-min)+1];
    for(int i=0;i<input.length;i++){
      int no=input[i];
      countingArray[no-1]=countingArray[no-1]+1;
         }
    
    int counter=0;
    for(int i=0;i<countingArray.length;i++){
    int no=countingArray[i];
    for(int j=0;j<no;j++){
        input [counter]=i+1;
        counter++;
    }
}
}
}
//  static int range = 0;
//    public static void countingSort(int[] array) {
//      
//
//        int[] values = new int[range + 1];
//        for (int i = 0; i <= range; i++) {
//            values[i] = 0;
//        }
//        for (int i = 0; i < array.length; i++) {
//            values[array[i]]++;
//        }
//        int[] arr = new int[array.length];
//        int k = 0;
//        for (int i = 0; i <= range; i++) {
//            for (int j = 0; j < values[i]; j++) {
//                arr[k++] = i;
//            }
//        }
//        array = arr;
//    }
//
//    public static void main(String args[]) {
//        range = 9;
//        int[] a = new int[]{1, 5, 0, 6, 9, 5, 0, 3, 2, 4, 5, 8, 7, 6, 1, 4};
//        countingSort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }


