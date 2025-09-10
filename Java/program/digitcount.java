package Java.program;

public class digitcount {
    public static void main(String[] args) {
        int number = 1264646;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
