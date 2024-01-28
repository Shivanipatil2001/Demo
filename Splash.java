 package employee.management.system;

 import javax.swing.*;
 import java.awt.*;

 public class Splash extends JFrame {
    Splash(){
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/front.gif"));
        Image i2= i1.getImage().getScaledInstance(1170,650,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel Image=new JLabel(i3);
       Image.setBounds(0,0,1050,500);
       add(Image);

        setSize(1170,650);
        setLocation(200,50);
        setLayout(null);
        setVisible(true);

        try{
            Thread.sleep(5000);
           setVisible(false);
           new login();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Splash();
    }
}
