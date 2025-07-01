import java.util.Arrays;

public class Day01_SecondLargest {

    // sorting approach (naive)
    static int getSecLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[i - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    // two pass approach (better)
    static int getSecondLar(int[] arr) {
        int n = arr.length;
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("largest is : " + largest);

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    // one pass search (expected)
    static int getSecLar(int arr[]) {
        int n = arr.length;
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 19, 23};
        System.out.println(getSecLargest(arr));
        System.out.println(getSecondLar(arr));
        System.out.println(getSecLar(arr));
    }
}
