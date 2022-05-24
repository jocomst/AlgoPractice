import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        for(int i : arr) {
            System.out.println(i);
        }

        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println();
        for(int i : arr) {
            System.out.println(i);
        }

        CountingSort ob = new CountingSort();
        char cArr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's' };

        ob.sort(cArr);

        System.out.print("Sorted character array is ");
        for (int i = 0; i < cArr.length; ++i)
            System.out.print(cArr[i]);

    }


}
