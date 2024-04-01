import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int num=input.nextInt();
        int max=num;
        int min=num;
        int sum=num;
        float avg=num;
        System.out.println("min, max, sum, and average   after addition of " + num + " is " + min + ", " + max + ", " + sum + ", " + avg );

        for (int i = 0; i < n-1; i++) {
            int num2=input.nextInt();
            
            if(num2>max){
                max=num2;
            }

            if(num2<min){
                min=num2;
            }

            sum+=num2;
            avg=(float)sum/(i+2);
            System.out.println("min, max, sum, and average   after addition of " + num2 + " is " + min + ", " + max + ", " + sum + ", " + avg );
        }
    }
}