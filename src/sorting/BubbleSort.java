public class BubbleSort {

    public  void bubble(int arr[]) {
        int i, temp, j;
        for (i = 0; i <=arr.length - 2; i++) {      //notice it  <=
            for (j = 0; j <=arr.length-2-i; j++) {  //notice it <=
               
                /*          OR
                for (int i = 0; i < arr.length-1; i++) //<
            for (int j = 0; j < arr.length-i-1; j++) //<
         
                */
                if (arr[j] > arr[j + 1]) { 
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
 void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
 public static void main(String args[]) 
    { 
        BubbleSort ob = new BubbleSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.bubble(arr);
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
}
