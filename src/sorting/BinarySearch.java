public class BinarySearch {
  public static int binarySearch(int arr[],int num){
      int l=0;
      int r=arr.length-1;
      int mid;
      while(l<=r){
          mid=(l+r/2);
          if(arr[mid]==num)
              return mid;
            else if (num<arr[mid])
          {
              r=mid-1;
          }
          else{
              l=mid+1;
      
            } }
        return -1;   
  
  }
 
public static void main(String[] args) {
   int arr[]={1,2,3,4,5,6};
   int num=6;
    binarySearch(arr, num);
  
}
  
}
