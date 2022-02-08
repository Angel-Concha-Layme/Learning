import javax.swing.*;
import java.awt.event.*;

public class Button1 extends JFrame implements ActionListener{
    JButton boton1;
    public Button1(){
        setLayout(null);
        boton1 = new JButton("cerrar");
        boton1.setBounds(300,250,100,30); // (x,y,width,height)
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        Button1 button1 = new Button1();
        button1.setBounds(0,0,450,350);
        button1.setVisible(true);
        button1.setResizable(false);
        button1.setLocationRelativeTo(null);
    }
}



