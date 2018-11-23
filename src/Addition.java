import java.util.Scanner;

class Addition {
    public void add(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ile liczb chcesz dodać?");
        int amount = input.nextInt();
        double numbers[] = new double [amount];
        for (int i=0; i<amount; i++) {
            System.out.println("Podaj element " + i );
            numbers[i] = input.nextDouble();
        }
        double result=0;
        for (int i=0; i<amount; i++) {
            result += numbers[i];
        }

        System.out.println("wynik dodawania to: " + result);
    }
}
