public class tasksort {
    public void sort(int arr[]) {
        int N = arr.length;

        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        for (int i = N - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    } //сортировка 

    void heapify(int arr[], int N, int i) {
        int largest = i;
        int a = 2 * i + 1;
        int b = 2 * i + 2;

        if (a < N && arr[a] > arr[largest])
            largest = a;

        if (b < N && arr[b] > arr[largest])
            largest = b;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    } // замена значений

    static void printArray(int arr[]) {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 15, 23, 3, 111, 13, 225 };
        int N = arr.length;

        tasksort ob = new tasksort();
        ob.sort(arr);

        printArray(arr);
    }// печать отсортированного массива
}