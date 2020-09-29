import java.util.Scanner;

class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int num = SCANNER.nextInt();

        if (num == 1) {
            System.out.println("Yes!");
        } else if (num >= 2 && num <= 4) {
            System.out.println("No!");
        } else {
            System.out.println("Unknown number");
        }
    }
}