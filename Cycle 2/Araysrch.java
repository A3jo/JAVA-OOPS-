import java.util.Scanner;
public class Araysrch {
    public static void main(String[] args) {
    	System.out.println(" \nName:Ajo Jojo\nRoll no:23MCA008\nTitle:Array-Search\nDate:26-FEB-2024\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element " + searchElement + " found in the array.");
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
        scanner.close();
    }
}


