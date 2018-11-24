import java.util.InputMismatchException;
import java.util.Scanner;

class Addition {
    public void add(){
        Scanner input = new Scanner(System.in);
        boolean error = true;
        while (error) {
            try {
                System.out.println("Ile liczb chcesz dodać?");
                int amount = input.nextInt();
                double numbers[] = new double[amount];
                for (int i = 0; i < amount; i++) {
                    System.out.println("Podaj element " + i);
                    numbers[i] = input.nextDouble();
                }
                double result = 0;
                for (int i = 0; i < amount; i++) {
                    result += numbers[i];
                }

                System.out.println("wynik dodawania to: " + result);
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Podałeś złą wartość, spróbuj jeszcze raz: ");
            } finally{
                input.nextLine();
            }
        }
        input.close();
    }
}
