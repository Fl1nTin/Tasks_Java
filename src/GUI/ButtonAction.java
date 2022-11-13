package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction {
    JFrame frame = new JFrame("Frame"); //окно
    JLabel label = new JLabel("что-то написано"); //текстовое поле

    public static void main(String[] args) {
        ButtonAction test = new ButtonAction();
        test.go();
    }
    void go(){
        JButton button = new JButton("Action");
        frame.getContentPane().add(BorderLayout.SOUTH, button); //gCP()панель для нескольких объектов до 5
        button.addActionListener(new ColorListener()); //заинтересованность в кнопке для события

        JButton button1 = new JButton("Label");
        button1.addActionListener(new LabelListener());
        frame.getContentPane().add(BorderLayout.EAST, button1);

        frame.add(BorderLayout.WEST, label);

        GuiColor color = new GuiColor();
        frame.getContentPane().add(BorderLayout.CENTER, color);


        frame.setSize(300, 300);
        frame.setVisible(true); //видимость окна
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //завершает программу
    }

    class ColorListener implements ActionListener { //событие кнопки
        @Override
        public void actionPerformed(ActionEvent e) { //обработка нажатия
            frame.repaint(); //для каждого виджета (перекрасить)
        }
    }
    class LabelListener implements ActionListener { //событие кнопки
        @Override
        public void actionPerformed(ActionEvent e) { //обработка нажатия
            label.setText("поменял"); //смена при нажатии
        }
    }
}