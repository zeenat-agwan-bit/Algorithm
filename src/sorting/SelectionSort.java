class Alpha{
public static void main(String[] args) {
        int arr[] = {89,45,78,10,65,34,87};
        Beta b = new Beta();
  b.selectionSort(arr);
        Gamma g = new Gamma();
        g.display(arr);
    }
}

class Beta {

    void selectionSort(int arr[]) {
        int i, j, k, min, temp;
        for (i = 0; i <= arr.length - 2; i++) {
            min = arr[i];
            k = i;
            for (j = i + 1; j<= arr.length - 1; j++) {//when i was 1 j was 2 and each time j is increament by 1
                if (arr[j] < min) {
                    min = arr[j];  //update
                    k = j;           //update
                }
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }
}
 class Gamma {

    void display(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + "");
        }
    }
}
 