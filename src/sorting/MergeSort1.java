public class MergeSort1 {
  void merge(int arr[],int lb,int mid,int ub){
      int i=lb;
      int j=mid+1;
      int k=lb;
      int b[]={};
      while(i<=mid && j<=ub){
          if(arr[i]<=arr[j]){
              b[k]=arr[i];
              i++;
          }
          else{
              b[k]=arr[j];
              j++;
          }
          k++;
      }
      if(i>mid){
          while(j<=ub){
              b[k]=arr[j];
              j++;
              k++;
          }
//          else{ 
//                  while(i<=mid){
//                  b[k]=arr[i];
//                  i++;
//                  k++;
//                  
//                  }
      }
 for(k=lb;k<=ub;k++){
     arr[k]=b[k];
 }
  }}