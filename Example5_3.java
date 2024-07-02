public class Example5_3
public static void main(String[] args){
   String str = "Computer science is a dynamic science.";
        String substr = "science";

        int spaceCount = countSpaces(str);
        System.out.println("String is: " + str);
        System.out.println("Number of spaces is: " + spaceCount);

        int substringOccurrences = substringCount(str, substr);
        System.out.println("***");
        System.out.println("String is: " + str);
        System.out.println("Substring is: " + substr);
        System.out.println("Substring occurs " + substringOccurrences + " times in str.");
    }

    public static int countSpaces(String s) {
        int count = 0;
        int index = s.indexOf(' ');
        while (index >= 0) {
            count++;
            index = s.indexOf(' ', index + 1);
        }
        return count;
    }
