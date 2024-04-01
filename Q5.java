import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

    public static int lowerBound(int[] arr, int x) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static int upperBound(int[] arr, int x) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static boolean isPresent(int[] arr, int x) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                return true;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 4, 5, 6, 7 };
        int x = 3;
        System.out.println("Lower bound of " + x + ": " + lowerBound(arr, x));
        System.out.println("Upper bound of " + x + ": " + upperBound(arr, x));
        System.out.println(x + " is present in the array: " + isPresent(arr, x));
    }
}
