package GUI;
import javax.swing.*;
import java.awt.*;  
public class MainG { 
    public static void main(String[] args) {
        innit();
    } 
    public static void innit() {
        JFrame f=new JFrame();
        JButton b = new JButton("a");
        JButton b1 = new JButton();
        JScrollPane a = new JScrollPane();
        a.createHorizontalScrollBar();
        JPanel buttonCorner = new JPanel(); //use FlowLayout
        JToggleButton isMetric = new JToggleButton("cm", true);
        isMetric.setFont(new Font("SansSerif", Font.PLAIN, 11));
        isMetric.setMargin(new Insets(2,2,2,2));
        buttonCorner.add(isMetric);
                //JScrollBar b1=new JScrollBar(JScrollBar.VERTICAL, 0, 1, 0, 100);
        //f.add(b1,BorderLayout.EAST);
        f.setSize(400,500);
        f.setVisible(true);
    }


}