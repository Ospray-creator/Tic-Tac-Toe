import java.util.Scanner;

class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        long a = SCANNER.nextLong();
        char op = SCANNER.next().charAt(0);
        long b = SCANNER.nextLong();

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Division by 0!");
                }

                break;
            case '*':
                System.out.println(a * b);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}