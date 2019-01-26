package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JPanel implements ActionListener {
    JTextField textField;
    JTextArea textArea;
    JButton addButton = new JButton("+");
    JButton subButton = new JButton("-");
    JButton multiButton = new JButton("*");
    JButton divButton = new JButton("/");
    JButton cButton = new JButton("C");
    JButton resultButton = new JButton("=");
    JFrame frame = new JFrame("Calculator");
    String newLine = "\n";

    public View() {
        textField = new JTextField("Parse here", 10);
        textField.addActionListener(this);

        textArea = new JTextArea("Here's the result: \n", 5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(textField, BorderLayout.WEST);
        frame.add(scrollPane, BorderLayout.EAST);
    }

    public void addButtons(JMenuBar menuBar) {
        menuBar.add(addButton);
        menuBar.add(subButton);
        menuBar.add(multiButton);
        menuBar.add(divButton);
        menuBar.add(cButton);
        menuBar.add(resultButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        textArea.append(text + newLine);
        textField.selectAll();

        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    public void createAndShowGUI() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorderPainted(true);
        menuBar.setPreferredSize(new Dimension(100, 20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        addButtons(menuBar);

        frame.add(new View());

        frame.pack();
        frame.setVisible(true);
    }

    public void run() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
