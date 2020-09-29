import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(conv(Integer.parseInt(new Scanner(System.in).next())));
    }

    private static String conv(int lum) {

        switch (lum) {
            case 1:
                return "move up";
            case 2:
                return "move down";
            case 3:
                return "move left";
            case 4:
                return "move right";
            case 5:
                return "do not move";
            default:
                return "error!";
        }
    }
}
