import java.util.Scanner;

public class StringComparisonExample {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = console.next();

        System.out.print("Enter the second string: ");
        String str2 = console.next();

        if (str1.compareTo(str2) == 0) {
            System.out.println("The strings are equal.");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("The first string comes before the second string.");
        } else {
            System.out.println("The first string comes after the second string.");
        }
    }
}
