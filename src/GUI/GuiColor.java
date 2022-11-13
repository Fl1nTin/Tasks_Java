package GUI;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class GuiColor extends JPanel{
    DrawInPanel paint = new DrawInPanel();
    int x = 10;
    int y = 10;

    JFrame frame = new JFrame("Frame"); //окно
    public static void main(String[] args) {
        GuiColor test = new GuiColor();
        test.go();
    }
    void go(){
        //frame.getContentPane().add(BorderLayout.CENTER, new GuiColor()); //gCP()панель для нескольких обьектов до 5

        frame.setSize(300, 300);
        //frame.setBounds(500, 300, 300, 300); //размер и расположение на экране
        frame.setVisible(true); //видимость окна
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //завершает программу

        frame.getContentPane().add(paint);
        drawOval();
    }
    void drawOval(){
        for (int i = 0; i < 150; i++) {
            ++x;
            ++y;
            paint.repaint();
            try {
                Thread.sleep(50);
            }catch (Exception e){}
        }
    }

    /*public void paintComponent(Graphics color){
        //Image image = new ImageIcon("C:\\Users\\MrFreeman\\Desktop\\Cat.jpg").getImage(); //картинка
        //color.drawImage(image, 3,4,this);

        Graphics2D d2 = (Graphics2D) color; //родитель Graphics
        color.fillRect(0,0,this.getWidth(), this.getHeight()); //заполнить все окно однотонно

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        int redE = (int) (Math.random() * 255);
        int greedE = (int) (Math.random() * 255);
        int blueE = (int) (Math.random() * 255);
        Color endColor = new Color(redE, greedE, blueE);
        GradientPaint paint = new GradientPaint(20, 60, startColor, 160, 160, endColor); //градиент цветов

        d2.setPaint(paint); //включить вывод на экран
        d2.fillOval(10, 10,50,50); //заполнить по оси и размер
    }*/
    class DrawInPanel extends JPanel{
        public void paintComponent(Graphics color){
            Graphics2D d2 = (Graphics2D) color; //родитель Graphics

            d2.setColor(Color.white); //для обновления поля
            d2.fillRect(0,0,this.getWidth(),this.getHeight()); //отрисовка заднего фона

            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            Color startColor = new Color(red, green, blue);

            int redE = (int) (Math.random() * 255);
            int greedE = (int) (Math.random() * 255);
            int blueE = (int) (Math.random() * 255);
            Color endColor = new Color(redE, greedE, blueE);
            GradientPaint paint = new GradientPaint(20, 60, startColor, 160, 160, endColor); //градиент цветов

            d2.setPaint(paint); //включить вывод на экран
            d2.fillOval(x, y,50,50); //заполнить по оси и размер
        }
    }
}
