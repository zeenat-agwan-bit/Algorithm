/* Java program for Merge Sort */
public class MergeSort {

    int[] newarr;
    int tempMergeArr[];
    int length;

    public static void main(String[] args) {
        int[] arr = {11,1, 12, 6, 5, 13, 7};
        MergeSort ms = new MergeSort();
        ms.sort(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public void sort(int arr[]) {
        this.newarr = arr;
        this.length = arr.length;
        this.tempMergeArr = new int[length];//we create temp array
        divideArray(0, length - 1);
    }

    public void divideArray(int lb, int ub) {
        if (lb < ub) {
            int mid = lb + (ub - lb) / 2;
            //it will sort the left side of an array
            divideArray(lb, mid);
            //it will sort the right side of an array
            divideArray(mid + 1, ub);
            mergeArray(lb, mid, ub);
        }
    }

    public void mergeArray(int lb, int mid, int ub) {
        for (int i = lb; i <= ub; i++) {
            tempMergeArr[i] = newarr[i];
        }
        int i = lb;
        int j = mid + 1;
        int k = lb;
        while (i <= mid && j <= ub) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                newarr[k] = tempMergeArr[i];
                i++;
            } else {
                newarr[k] = tempMergeArr[j];
                j++;

            }
            k++;
        }
        while (i <= mid) {
            newarr[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}
