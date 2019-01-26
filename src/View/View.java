package View;

import javax.swing.*;
import java.awt.*;

public class View {
    /**
     * Dobra teraz potrzebuję przejść do tego by zrobić output i aplikacja mogła odczytywać input z
     * textField i parsować do JTextArea po prawej stronie. Tam będzie wynik równania.
     */
    public static void createGUI() {
        JFrame frame = new JFrame("Calculator MBudzisz");
        JMenuBar menuBar = new JMenuBar();
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton multi = new JButton("*");
        JButton div = new JButton("/");
        JButton exp = new JButton("^");
        JButton reset = new JButton("C");
        JTextField textField = new JTextField(30);

        JLabel yellowLabel = new JLabel();

        frame.setJMenuBar(menuBar);
        setMenuBar(menuBar, add, sub, multi, div, exp, reset);
        setYellowLabel(yellowLabel, frame, textField);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }

    private static void setMenuBar(JMenuBar menuBar, JButton add, JButton sub, JButton multi, JButton div, JButton exp,
                                   JButton reset) {
        menuBar.setOpaque(true);
        menuBar.setBackground(new Color(27, 179, 179));
        menuBar.setPreferredSize(new Dimension(100, 22));
        menuBar.add(add, BorderLayout.LINE_START);
        menuBar.add(sub, BorderLayout.EAST);
        menuBar.add(multi, BorderLayout.EAST);
        menuBar.add(div, BorderLayout.EAST);
        menuBar.add(exp, BorderLayout.EAST);
        menuBar.add(reset, BorderLayout.EAST);
    }

    private static void setYellowLabel(JLabel yellowLabel, JFrame frame, JTextField textField) {
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
        frame.getContentPane().add(textField, BorderLayout.LINE_START);
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(238, 244, 7));
        yellowLabel.setPreferredSize(new Dimension(400, 180));
    }
}
