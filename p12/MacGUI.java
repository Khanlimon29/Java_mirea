import javax.swing.*;

public class  MacGUI implements IGUI {
    @Override
    public void drawGUI() {
        JButton button = new JButton("MacOS Button");
        JCheckBox checkbox = new JCheckBox("MacOS Checkbox");
        JFrame frame = new JFrame("MacOS UI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button);
        frame.add(checkbox);
        frame.setVisible(true);
    }
} 