import javax.swing.*;

public class WinGUI implements IGUI {
    @Override
    public void drawGUI() {
        JButton button = new JButton("Windows Button");
        JCheckBox checkbox = new JCheckBox("Windows Checkbox");
        JFrame frame = new JFrame("Windows UI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button);
        frame.add(checkbox);
        frame.setVisible(true);
    }
} 