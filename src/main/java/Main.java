import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int key = 1;
        Scanner in = new Scanner(System.in);
        while (key == 1) {

            System.out.print("Input your expression: ");

            if (!(in.hasNextDouble())) {
                in.nextLine(); // применяем для очистки буфера сканнера
                System.out.print("Error! Incorrect value! Try again! ");
                continue;
            }

            double firstValue = in.nextDouble();

            char operation = in.next().charAt(0);

            if (!(in.hasNextDouble())) {
                in.nextLine();
                System.out.print("Error! Incorrect value! Try again! ");
                continue;
            }

            double secondValue = in.nextDouble();

            if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
                in.nextLine();
                System.out.print("Error! Incorrect value! Try again! ");
                continue;
            }

            if (operation == '+') {
                Summation summation = new Summation(firstValue, secondValue);
                summation.execute();
            }

            if (operation == '-') {
                Subtraction subtraction = new Subtraction(firstValue, secondValue);
                subtraction.execute();
            }

            if (operation == '*') {
                Multiplication multiplication = new Multiplication(firstValue, secondValue);
                multiplication.execute();
            }

            if (operation == '/') {
                Division division = new Division(firstValue, secondValue);
                division.execute();
            }

            System.out.print("Input a key (1 - continue, else - break): ");
            key = in.nextInt();

        }
        in.close();
    }
}
