//Botón RGB
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Formulario6 extends JFrame implements ActionListener{
    JLabel lbl1, lbl2, lbl3;
    JComboBox combo1, combo2, combo3;
    JButton btn1, btn2;

    public Formulario6(){
        setLayout(null);
        lbl1 = new JLabel("Red");
        lbl1.setBounds(10,10,80,20); //(x,y,height,width)
        add(lbl1);
        
        lbl2 = new JLabel("Green");
        lbl2.setBounds(10,40,80,20); //(x,y,height,width)
        add(lbl2);

        lbl3 = new JLabel("Blue");
        lbl3.setBounds(10,70,80,20); //(x,y,height,width)
        add(lbl3);
        
        combo1 = new JComboBox();
        combo1.setBounds(100,10,80,20);
        add(combo1);

        combo2 = new JComboBox();
        combo2.setBounds(100,40,80,20);
        add(combo2);

        combo3 = new JComboBox();
        combo3.setBounds(100,70,80,20);
        add(combo3);

        for(int i=0; i<256; i++){
            combo1.addItem(i);
            combo2.addItem(i);
            combo3.addItem(i);
        }

        btn1 = new JButton("Mostrar color");
        btn1.setBounds(10,100,80,20);
        add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("Salir");
        btn2.setBounds(100,100,80,20);
        add(btn2);
        btn2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1){
            int red = (int)combo1.getSelectedItem();
            int green = (int)combo2.getSelectedItem();
            int blue = (int)combo3.getSelectedItem();
            getContentPane().setBackground(new Color(red, green, blue));
        }
        if(e.getSource() == btn2){
            System.exit(0);
        }
    }

    public static void main(String args[]){
        Formulario6 formulario = new Formulario6();
        formulario.setBounds(0,0,300,180);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null); //Centrar ventana
    }
}