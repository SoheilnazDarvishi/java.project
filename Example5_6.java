public class Examples 5_6 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 8;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        int sum = num1 + num2;
        System.out.println("Sum of num1 and num2: " + sum);

        String s = "12";
        int parsedInt = Integer.parseInt(s);
        System.out.println("Parsed integer from string: " + parsedInt);

        String combinedString = num1 + " + " + num2 + " = " + sum;
        System.out.println("Convert int to string and concatenate: " + combinedString);
    }
}
