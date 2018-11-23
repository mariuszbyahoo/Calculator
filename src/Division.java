import java.util.Scanner;

class Division {
    public void div(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ile liczb chcesz dzielić?");
        int amount = input.nextInt();
        double numbers[] = new double [amount];
        for (int i=0; i<amount; i++) {
            System.out.println("Podaj element " + i );
            numbers[i] = input.nextDouble();
        }
        double result=numbers[0]*numbers[0];
        for (int i=0; i<amount; i++) {
            result /= numbers[i];
        }
        System.out.print("Wynik dzielenia to: "+result);
        /*if(divisor != 0) {
            System.out.print("Wynik dzielenia to: ");
            System.out.print(dividend / divisor);
        }else{
            System.out.println("Nie można dzielić przez 0!");
        }*/
    }
}
