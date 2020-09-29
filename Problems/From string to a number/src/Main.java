import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(conv(new Scanner(System.in).next()));
    }

    private static int conv(String line) {
        switch (line) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            default:
                return 9;
        }
    }
}