package View;

import Actions.Subtraction;
import App.Program;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParsePosition;

public class SubLogic extends ActionLogic {
    @Override
    public void action(DecimalFormat nf, String numberTwo) {
        numberTwo = View.textField.getText();
        Subtraction subtraction = new Subtraction();
        Program.secondNumber = (BigDecimal) nf.parse(numberTwo, new ParsePosition(0));
        View.textArea.append(Program.secondNumber.toString() + "\n=\n");
        subtraction.sub(Program.firstNumber, Program.secondNumber);
        View.textArea.append(Program.firstNumber.toString() + "\n");
        View.textField.setText(Program.firstNumber.toString());
    }
}
