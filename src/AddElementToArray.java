import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] oldArray = new int[10];
        int index;
        int number;
        int[] newArray = new int[11];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 element of array: ");
        for (int i = 0; i < 10; i++) {
            oldArray[i] = scanner.nextInt();
        }
        System.out.println("Enter the location you want to add: ");
        index = scanner.nextInt();
        System.out.println("Enter the number you want to add: ");
        number = scanner.nextInt();

        for (int i = 0; i < index; i++) {
            newArray[i] = oldArray[i];
        }
        if (index > (9)) {
            newArray[10] = number;
        } else
            newArray[index] = number;
        for (int i = index; i < 10; i++) {
            newArray[i + 1] = oldArray[i];
        }
        System.out.println("New Array: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
