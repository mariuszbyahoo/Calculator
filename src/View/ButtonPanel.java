package View;

import App.Calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class ButtonPanel extends JMenuBar implements ActionListener {
    private static final int HEIGHT = 75;
    private static final int WIDTH = 100;
    private String numberOne;
    private String numberTwo;
    private JButton addButton;
    private JButton subButton;
    private JButton multiButton;
    private JButton divButton;
    private JButton expButton;
    private JButton cButton;
    private JButton equalsButton;
    DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();

    /**
     * In the ButtonPanel() method we are creating all of the buttons, and set them.
     */
    public ButtonPanel() {
        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");
        expButton = new JButton("^");
        cButton = new JButton("C");
        equalsButton = new JButton("=");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiButton.addActionListener(this);
        divButton.addActionListener(this);
        expButton.addActionListener(this);
        cButton.addActionListener(this);
        equalsButton.addActionListener(this);

        setBorderPainted(true);
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(addButton);
        add(subButton);
        add(multiButton);
        add(divButton);
        add(expButton);
        add(cButton);
        add(equalsButton);

    }

    /**
     * This method is deciding, which class from the Actions package will be used. It changes the value of the Action enum.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == addButton) {
            numberOne = View.textField.getText();
            View.textField.setText(null);

            nf.setParseBigDecimal(true);
            Calculation.firstNumber = (BigDecimal) nf.parse(numberOne, new ParsePosition(0));
            View.textArea.append(Calculation.firstNumber.toString() + "\n+\n");
            View.action = Action.ADD;
        } else if (source == subButton) {
            numberOne = View.textField.getText();
            View.textField.setText(null);

            nf.setParseBigDecimal(true);
            Calculation.firstNumber = (BigDecimal) nf.parse(numberOne, new ParsePosition(0));
            View.textArea.append(Calculation.firstNumber.toString() + "\n-\n");
            View.action = Action.SUB;
        } else if (source == multiButton) {
            numberOne = View.textField.getText();
            View.textField.setText(null);

            nf.setParseBigDecimal(true);
            Calculation.firstNumber = (BigDecimal) nf.parse(numberOne, new ParsePosition(0));
            View.textArea.append(Calculation.firstNumber.toString() + "\n*\n");
            View.action = Action.MULTI;
        } else if (source == divButton) {
            numberOne = View.textField.getText();
            View.textField.setText(null);

            nf.setParseBigDecimal(true);
            Calculation.firstNumber = (BigDecimal) nf.parse(numberOne, new ParsePosition(0));
            View.textArea.append(Calculation.firstNumber.toString() + "\n/\n");
            View.action = Action.DIV;
        } else if (source == expButton) {
            numberOne = View.textField.getText();
            View.textField.setText(null);

            nf.setParseBigDecimal(true);
            Calculation.firstNumber = (BigDecimal) nf.parse(numberOne, new ParsePosition(0));
            View.textArea.append(Calculation.firstNumber.toString() + "\n^\n");
            View.action = Action.EXP;

        } else if (source == cButton) {
            resetCalc();
        } else if (source == equalsButton) {
            if (View.action != null && !View.textField.equals(null)) {
                switch (View.action) {
                    case ADD:
                        addition(nf);
                        break;
                    case SUB:
                        subtraction(nf);
                        break;
                    case MULTI:
                        multiplication(nf);
                        break;
                    case DIV:
                        division(nf);
                        break;
                    case EXP:
                        exponentiation(nf);
                        break;
                }
            }
        }
    }

    /**
     * Here are the main logic of the GUI's work. It communicates with the App.Calculation variables and then parses the result of a calculation.
     * @param nf
     */
    private void addition(DecimalFormat nf) {
        AddLogic addLogic = new AddLogic();
        addLogic.action(nf, numberTwo);
    }

    private void subtraction(DecimalFormat nf) {
        SubLogic subLogic = new SubLogic();
        subLogic.action(nf, numberTwo);
    }

    private void multiplication(DecimalFormat nf) {
        MultiLogic multiLogic = new MultiLogic();
        multiLogic.action(nf, numberTwo);
    }

    private void division(DecimalFormat nf) {
        DivLogic divLogic = new DivLogic();
        divLogic.action(nf, numberTwo);
    }

    private void exponentiation(DecimalFormat nf) {
        ExpLogic expLogic = new ExpLogic();
        expLogic.action(nf, numberTwo);
    }

    private void resetCalc() {
        View.textField.setText("");
        View.textArea.setText("");
        Calculation.firstNumber = BigDecimal.ZERO;
        Calculation.secondNumber = BigDecimal.ZERO;

    }
}
