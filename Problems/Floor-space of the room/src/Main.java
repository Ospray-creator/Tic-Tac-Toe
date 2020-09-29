import java.util.Scanner;


class Main {
    final static double PI = 3.14;
    final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String type = scan.nextLine();
        double a, b, c, p;

        switch (type) {
            case "triangle":
                a = scan.nextDouble();
                b = scan.nextDouble();
                c = scan.nextDouble();
                p = (a + b + c) * 0.5;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                a = scan.nextDouble();
                b = scan.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                a = scan.nextDouble();
                System.out.println((a * a) * PI);

            default:
                break;
        }
        var in1 = 100;
        var in2 = 0;
        switch (in1) {
            case 100:
                in2 += in1;
            case 200:
                in2 += in1 / 4;
                break;
            case 300:
                in2 += in1 / 10;
                break;
        }
        System.out.println(in2);
    }
}