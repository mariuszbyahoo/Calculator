import java.util.Scanner;

class Multiplication {
    public void multi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj czynnik a: ");
        double factorA = input.nextDouble();
        System.out.println("Podaj czynnik b: ");
        double factorB = input.nextDouble();
        System.out.print("Wynik mnożenia to: ");
        System.out.print(factorA*factorB);
    }
}
