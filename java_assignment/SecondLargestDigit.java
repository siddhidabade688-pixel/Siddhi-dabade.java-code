import java.util.Scanner;

public class SecondLargestDigit {
    public static int findSecondLargest(int num) {
        int largest = -1;
        int secondLargest = -1;

        while (num > 0) {
            int digit = num % 10;

            // if digit is greater than largest
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } 
            // if digit is not equal to largest and greater than secondLargest
            else if (digit != largest && digit > secondLargest) {
                secondLargest = digit;
            }
            num = num / 10;
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int result = findSecondLargest(number);

        if (result == -1) {
            System.out.println("Less than two distinct digits exist.");
            System.out.println("No second-largest digit found.");
        } else {
            System.out.println("Second-largest distinct digit: " + result);
        }
        sc.close();
    }
}