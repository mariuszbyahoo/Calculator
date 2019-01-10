import java.math.BigDecimal;

public class ResetCalc {
    public void reset(){
        Program.firstNumber = BigDecimal.valueOf(0);
        Program.secondNumber = BigDecimal.valueOf(0);
        System.out.println(Program.firstNumber);
    }
}
