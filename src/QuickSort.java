import java.util.Random;

public class QuickSort{

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = new Random().nextInt(high - low) + low;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, high);
        int left = partition(arr, low, high, pivot);

        quickSort(arr, low, left - 1);
        quickSort(arr, left + 1, high);
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length);
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        int left = low;
        int right = high;

        while (left < right) {
            while(arr[left] <= pivot && left < right) {
                left++;
            }

            while(arr[right] >= pivot && left < right) {
                right--;
            }

            swap(arr, left, right);
        }

        swap(arr, left, high);
        return left;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
