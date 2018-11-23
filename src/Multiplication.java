import java.util.Scanner;

class Multiplication {
    public void multi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ile liczb chcesz mnożyć?");
        int amount = input.nextInt();
        double numbers[] = new double [amount];
        for (int i=0; i<amount; i++) {
            System.out.println("Podaj element " + i );
            numbers[i] = input.nextDouble();
        }
        double result=1;
        for (int i=0; i<amount; i++) {
            result *= numbers[i];
        }

        System.out.println("wynik mnożenia to: " + result);
    }
}
