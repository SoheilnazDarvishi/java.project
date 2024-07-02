import java.text.*;
import java.util.Date;

public class Examples {
    public static void main(String[] args) {
        Date now = new Date();
        DateFormat formatter;

        // Default date format
        formatter = DateFormat.getDateInstance();
        System.out.println("Default date: " + formatter.format(now));

        // Short format (UK)
        formatter = DateFormat.getDateInstance(DateFormat.SHORT, java.util.Locale.UK);
        System.out.println("Short (UK): " + formatter.format(now));

        // Medium format
        formatter = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Medium: " + formatter.format(now));

        // Long format
        formatter = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Long: " + formatter.format(now));

        // Full format
        formatter = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Full: " + formatter.format(now));
    }
}
