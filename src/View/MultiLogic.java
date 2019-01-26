package View;

import Actions.Multiplication;
import App.Program;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParsePosition;

public class MultiLogic extends ActionLogic {
    @Override
    public void action(DecimalFormat nf, String numberTwo) {
        numberTwo = View.textField.getText();
        Multiplication multiplication = new Multiplication();
        Program.secondNumber = (BigDecimal) nf.parse(numberTwo, new ParsePosition(0));
        View.textArea.append(Program.secondNumber.toString() + "\n=\n");
        multiplication.multi(Program.firstNumber, Program.secondNumber);
        View.textArea.append(Program.firstNumber.toString() + "\n");
        View.textField.setText(Program.firstNumber.toString());
    }
}
