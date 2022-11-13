package GUI;

import javax.swing.*;
import java.awt.*;

public class Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("OK");
        JButton button1 = new JButton("Exit");
        JButton button2 = new JButton("sdf");
        JPanel panel = new JPanel(); //FlowLayout - расположение по вертикали
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //BoxLayout - расположение по горизонтали
        panel.add(button);
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.WEST, panel); //BorderLayout - расположение в 5 точках

        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
