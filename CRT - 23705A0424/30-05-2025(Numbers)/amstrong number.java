import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int sum = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
        sc.close();
    }
}
