import java.util.InputMismatchException;
import java.util.Scanner;

class Subtraction {
    void sub(){
        Scanner input = new Scanner(System.in);
        boolean error = true;
        while (error) {
            try {
                System.out.println("Ile liczb chcesz odjąć?");

                int amount = input.nextInt();
                double numbers[] = new double[amount];
                for (int i = 0; i < amount; i++) {
                    System.out.println("Podaj element " + i);
                    numbers[i] = input.nextDouble();
                }
                double result = numbers[0] * 2; // za odjemną przyjmuję 2Xnumbers[0] bo konstrukcja w pętli przewiduje odjęcie jej na początku, więc jako result uzyskamy odjemną.
                for (int i = 0; i < amount; i++) {
                    result -= numbers[i];
                }
                System.out.println("wynik odejmowania to: " + result);
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Podałeś złą wartość, jeszcze raz: ");
            }
        }
    }
}

