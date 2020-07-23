
public class LinearSearch {

    public static int linearSerach(int arr[], int num) {
        int i;
        for ( i = 0; i <= arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Element found at position: " +i );
                break;
            }
        }
        if (arr[i] == arr.length) {
            System.out.println("Element not found");
        }
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int num = 6;
        linearSerach(arr, num);
    }

}
