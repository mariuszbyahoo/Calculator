import java.util.Scanner;

class Subtraction {
    void sub(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj odjemną: ");
        double minuend = input.nextDouble();
        System.out.println("Podaj odjemnik: ");
        double subtrahend = input.nextDouble();
        System.out.print("Wynik odejmowania to: ");
        System.out.print(minuend - subtrahend);

    }
}
