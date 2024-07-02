import java.text.*;

public class Example5_8 {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getNumberInstance();

        // Set maximum fraction digits
        formatter.setMaximumFractionDigits(5);
        System.out.println("Truncated PI: " + formatter.format(Math.PI));

        // Set minimum integer digits
        formatter.setMinimumIntegerDigits(4);
        System.out.println("Truncated PI: " + formatter.format(Math.PI));

        // Money formatting
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Money symbol usage: " + money.format(3.53));

        // Percent formatting
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println("Percent symbol usage: " + percent.format(0.353));

        // Decimal formatting
        DecimalFormat formatting = (DecimalFormat) NumberFormat.getNumberInstance();
        formatting.setDecimalSeparatorAlwaysShown(true);
        System.out.println("Show decimal point always: " + formatting.format(3.0));
        formatting.setDecimalSeparatorAlwaysShown(false);
        System.out.println("Not show decimal point always: " + formatting.format(3.0));
    }
}
