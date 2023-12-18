package sudoku;

import javax.swing.*;
import java.awt.*;

public class AboutFrame extends JFrame {
    public AboutFrame(){
        setSize(400,600);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2,1));

        JTextArea about = new JTextArea();
        about.setText("Sudoku & Tic Tac Toe built with Java & Swing\nVersion 1.0\n");
        about.setEditable(false);
        JTextArea about2 = new JTextArea();
        about2.setText("\nCreated by: Tito Virgiawan, Maureen Ghassani, Mutiara Noor");
        about2.setEditable(false);

        add(about);
        add(about2);
        setTitle("About");
        setVisible(true);
    }
}
