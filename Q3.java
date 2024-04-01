import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();

        }
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();

        }

        int[] arr3 = new int[n1 + n2];

        int k = 0;
        int l = 0;
        
        for (int i = 0; i < n1 + n2; i++) {
            if (k < n1 && l < n2) {

                if (arr1[k] < arr2[l]) {
                    arr3[i] = arr1[k];
                    k++;
                } else {
                    arr3[i] = arr2[l];
                    l++;
                }

            } else if (k < n1) {
                arr3[i] = arr1[k];
                k++;
            } else {
                arr3[i] = arr2[l];
                l++;
            }
            System.out.println(arr3[i]);
        }

    }
}
