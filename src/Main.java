import java.awt.event.*;  
import javax.swing.*; 
import cosas.Breach;
public class Main {
    public static void main(String[] args) { 
    JButton b=new JButton();//creating instance of JButton
    b.setIcon(new ImageIcon("Img\\Breach\\Chayula\\ChayulasPureBreachstone.png"));
    b.setBounds(0,0,60,40);//x axis, y axis, width, height
    Breach breach = new Breach();

    System.out.println(breach.a);

    JFrame f=new JFrame();//creating instance of JFrame
    final JTextField ct=new JTextField();
    ct.setBounds(65,10, 150,20);

    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){  
            ct.setText("Welcome to Javatpoint.");  
        }  
    });
    f.add(b);//adding button in JFrame
    f.add(ct);
    f.setSize(400,500);//400 width and 500 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  
    } 
}  