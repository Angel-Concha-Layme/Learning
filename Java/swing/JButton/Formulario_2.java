package JButton;
import javax.swing.*;
import java.awt.event.*;


public class Formulario_2 extends JFrame implements ActionListener{
    private JButton boton1,boton2,boton3,boton4;
    private JLabel label1;
    public Formulario_2(){
        setLayout(null);
        boton1 = new JButton("1");
        boton1.setBounds(10,100,90,30); // (x,y,width,height)
        add(boton1);
        boton1.addActionListener(this);
        boton2 = new JButton("2");
        boton2.setBounds(110,100,90,30); // (x,y,width,height)
        add(boton2);
        boton2.addActionListener(this);
        boton3 = new JButton("3");
        boton3.setBounds(210,100,90,30); // (x,y,width,height)
        add(boton3);
        boton3.addActionListener(this);

        boton4 = new JButton("salir");
        boton4.setBounds(320,250,90,30); // (x,y,width,height)
        add(boton4);
        boton4.addActionListener(this);

        label1 = new JLabel("En espera...");
        label1.setBounds(10,10,300,50); // (x,y,width,height)
        add(label1);
    } 

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            label1.setText("Has precionado el boton 1");
        } 
        else if(e.getSource()==boton2){
            label1.setText("Has precionado el boton 2");
        }
        else if(e.getSource()==boton3){
            label1.setText("Has precionado el boton 3");
        }
        if(e.getSource()==boton4){
            System.exit(0);
        }
    }
    
    public static void main(String args[]){
        Formulario_2 Formulario = new Formulario_2();
        Formulario.setBounds(0,0,450,350); // (x,y,width,height)
        Formulario.setVisible(true); // hacer visible el frame
        Formulario.setResizable(false); // no permitir cambiar el tamaño de la ventana
        Formulario.setLocationRelativeTo(null); // centrar la ventana en la pantalla
    }
}