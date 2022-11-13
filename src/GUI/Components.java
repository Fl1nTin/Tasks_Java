package GUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Components implements ActionListener, ItemListener, ListSelectionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField text = new JTextField(20); //текстовое поле
    JTextArea area = new JTextArea(10,10); //текстовое поле большое
    JCheckBox checkBox = new JCheckBox("check"); //флажок
    JList list = new JList(new String[]{"kfoskd", "fokdsdf","ofkds","ofkeo"}); //принимает любой массив

    public static void main(String[] args) {
        Components components = new Components();
        components.go();
    }
    void go(){
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(BorderLayout.WEST, text);

        JButton button = new JButton("fsd");
        button.addActionListener(this);
        panel.add(button);


        checkBox.addItemListener(this); //событие флажка
        //checkBox.setSelected(true); //установка флага
        panel.add(checkBox);


        list.addListSelectionListener(this);
        list();
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) { //проверка на использование флажка
        String onOrOff = "off";
        if (checkBox.isSelected())
            onOrOff = "on";
        area.append(onOrOff);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        area.setText("aaaaaaaaaaa");
    }

    @Override
    public void valueChanged(ListSelectionEvent e) { //событие для List
        if (!e.getValueIsAdjusting()) {
            String s = (String) list.getSelectedValue();
            text.setText(s);
        }
    }

    void textField(){
        text.requestFocus(); //курсор в конец
        text.setText("omvme");
        text.selectAll(); //выделить текст
    }
    void textArea(){
        JScrollPane scrollBar = new JScrollPane(area); //для определенного поля
        area.setLineWrap(true); //перенос текста
        scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); //задать
        scrollBar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); //запретить

        area.setText("spdkfo"); //заменить текст
        area.append("\nzzzzzzzzzzzz"); //добавить
        panel.add(scrollBar);
    }
    void list(){
        JScrollPane pane = new JScrollPane(list);
        pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        list.setVisibleRowCount(4); //задать кол-во до прокрутки
        //list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //выбор до 1 строки

        panel.add(pane);
    }
}
