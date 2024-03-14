import java.util.Scanner;
import java.util.Arrays;
public class Sort
{
    public static void main(String[] args)
    {
        int n;
        System.out.println(" \nName:Ajo Jojo\nRoll no:23MCA008\nTitle:Sort-Strings\nDate:26-FEB-2024\n");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of strings you want to enter:\n");
        n = s.nextInt();
        String strings[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the Strings:");
        for(int i = 0; i < n; i++)
        {
            strings[i] = s1.nextLine();
        }
        System.out.println("Array: " + Arrays.toString(strings));
	Arrays.sort(strings);
	System.out.println("Sorted Array: " + Arrays.toString(strings));
    }
}
