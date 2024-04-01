import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 1;
        int num = 2;
        while (count <= 2 * n) {
            int c = 2;
            while (c * c <= num) {
                if (num % c == 0) {
                    break;
                }
                c += 1;
            }
            if (c * c > num) {
                if (count % 2 != 0) {

                    System.out.println(num);
                }
                count += 1;
            }
            num += 1;
        }

    }
}
