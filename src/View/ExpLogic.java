package View;

import Actions.Exponentiation;
import App.Program;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParsePosition;

public class ExpLogic extends ActionLogic {
    @Override
    public void action(DecimalFormat nf, String numberTwo) {
        numberTwo = View.textField.getText();
        Exponentiation exponentiation = new Exponentiation();
        Program.secondNumber = (BigDecimal) nf.parse(numberTwo, new ParsePosition(0));
        View.textArea.append(Program.secondNumber.toString() + "\n=\n");
        exponentiation.exp(Program.firstNumber, Program.secondNumber);
        View.textArea.append(Program.firstNumber.toString() + "\n");
        View.textField.setText(Program.firstNumber.toString());
    }
}
