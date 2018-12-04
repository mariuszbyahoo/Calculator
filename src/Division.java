import java.util.InputMismatchException;
import java.util.Scanner;

class Division {
    boolean error = true;
    public void div(){
        Scanner input = new Scanner(System.in);
        boolean error = true;
        while (error) {
            try {
                System.out.println("Ile liczb chcesz dzielić?");
                int amount = input.nextInt();
                double numbers[] = new double[amount];
                for (int i = 0; i < amount; i++) {
                    System.out.println("Podaj element " + i);
                    numbers[i] = input.nextDouble();
                }
                double result = numbers[0] * numbers[0];
                boolean zeroOccured = false;
                for (int i = 0; i < amount; i++) {
                    result /= numbers[i];
                    if (numbers[i] == 0) {
                        System.out.println("Nie można dzielić przez zero!");
                        zeroOccured = true;
                        break;
                    }
                }
                if (zeroOccured == true) {
                    System.out.println("Następnym razem nie dziel przez zero!");
                } else {
                    System.out.print("Wynik dzielenia to: " + result);
                }
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Podałeś złą wartość, spróbuj jeszcze raz: ");
            }
        }
    }
}
