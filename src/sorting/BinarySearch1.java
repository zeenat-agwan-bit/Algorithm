
public class BinarySearch1 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 8, 9};
        int data = 1;

        int left = 0;
        int right = arr.length - 1;
        int mid = left + right / 2;
        while (left <= right) {
            if (arr[mid] == data) {
                System.out.println("Element at the position " + mid);
                break;
            } else if (arr[mid] > data) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
            mid = left + right / 2;
        }
        if (left > right) {
            System.out.println("element not found !");
        }
    }

}
