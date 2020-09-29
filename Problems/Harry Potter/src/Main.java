import java.util.Scanner;

class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        String a = SCANNER.nextLine();

        switch (a) {
            case "gryffindor":
                System.out.println("bravery");
                break;
            case "ravenclaw":
                System.out.println("intellect");
                break;
            case "hufflepuff":
                System.out.println("loyalty");

                break;
            case "slytherin":
                System.out.println("cunning");
                break;
            default:
                System.out.println("not a valid house");
                break;
        }
    }
}