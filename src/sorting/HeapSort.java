package sorting;
/*
to get child  index position:
2*i+1=left child index
2*i+2=right child index

to get parent index position:
i-1/2  //where i is index position
*/
public class HeapSort{
public static void  main(String args[]){
int arr[]={44,20,26,12,10,40,65};
HeapSort hs=new HeapSort();
hs.sort(arr);
hs.printArray(arr);
}
//STEP 1: child(left/right) nodes's value should not be greater than its parent node.
void sort(int arr[]){
    
int length =arr.length;
for(int i =length/2 -1;i>=0;i--){    //len/2-1 which is an index position of right subtree's parent node.
heapify(arr,length,i);                   //here i is index position of parent node.

}
//STEP 2: Swap the elements and heapify again
for(int i=length-1;i>=0;i--)        //because this time we exclude the last element and swap the new array's element (last becomes first and last becomes first)
{
int temp=arr[0];
arr[0]=arr[i];
arr[i]=temp;
heapify(arr,i ,0);
}

}
void heapify(int [] arr ,int n,int i) {                                 //arr ,len,parent
    
//to find index position of child nodes

int largest=i;                      //since i is index pos of parent node
int left=2*i+1;                   // index position of left child
int right=2*i+2;                //index position of right child

//if the value of left child is greater than largest 
if(left<n && arr[left] > arr[largest]){
largest=left;
}

//if the value of right child is greater than largest 
if(right <n && arr [right]>arr[largest]){
largest=right;
}

//if parent node's index position is not equal to largest then swap them.
if(largest !=i){
int temp=arr[i];
arr[i]=arr[largest];
arr[largest]=temp;

heapify(arr , n ,largest);  
}
}

//PRINT THE ARRAY
void printArray(int[] arr) {
for(int i=0;i<arr.length;i++) {
System.out.println(arr[i]+ " " );
}
}



}