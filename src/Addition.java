import java.util.Scanner;

class Addition {
    public void add(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        double a = input.nextDouble();
        System.out.println("Podaj luczbę b: ");
        double b = input.nextDouble();
        double result = a + b;
        System.out.println("wynik dodawania to: " + result);
    }
}
