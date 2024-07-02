public class Example {
    public static void main(String[] args) {
        String str = "Hello ali";
        int width = 15;

        String leftJustified = StringFormatter.leftAdjust(str, width);
        System.out.println("Left justify: " + leftJustified);

        String rightJustified = StringFormatter.rightAdjust(str, width);
        System.out.println("Right justify: " + rightJustified);

        String centerJustified = StringFormatter.centerAdjust(str, width);
        System.out.println("Middle justify: " + centerJustified);
    }
}
