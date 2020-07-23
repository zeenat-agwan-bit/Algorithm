
public class HeapSort {

    public static void main(String[] args) {
        int arr[] = {22, 13, 17, 11, 10, 14, 12};
        HeapSort hs = new HeapSort();
        hs.sort(arr);
        hs.printArray(arr);
    }

    void sort(int arr[]) {
        int size = arr.length;
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }
        //(for rest of )swap the elements and heapify again
        for (int i = size - 1; i >= 0; i--) {  //size -1 bcz one element is already at its right place
            int temp = arr[0];  //swap 
            arr[0] = arr[i]; //largest
            arr[i] = temp;
            heapify(arr, i, 0);//for every heapify it starts with index 0
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;      //parent  node index position
        int li = 2 * i + 1;      //left child node index position
        int ri = 2 * i + 2;      //right child node index position

        if (li < n && arr[li] > arr[largest]) {
            largest = li; //swap
        }
        if (ri < n && arr[ri] > arr[largest]) {
            largest = ri; //swap
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);//this time we are passing largest
        }

    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
