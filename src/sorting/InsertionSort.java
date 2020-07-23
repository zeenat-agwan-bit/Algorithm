 public class InsertionSort  {
    public static void main(String[] args) {
        int arr[]={20,40,10,50,45};
      Beta1 b=new Beta1();
      b.insertionSort(arr);
      Gamma1 g=new Gamma1();
      g.display(arr);
    }
  }

class Beta1 {

    void insertionSort(int arr[]) {
        int item, i, j;
        for (i = 1; i <= arr.length - 1; i++) {
            item = arr[i];
            for (j = i - 1; j >= 0 && arr[j]>item; j--) { //note it
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = item;
        }
    }

}

class Gamma1 {

    void display(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + "");
        }
    }
}
 