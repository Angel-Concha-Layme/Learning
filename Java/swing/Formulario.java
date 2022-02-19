import javax.swing.*;
import java.awt.event.*; // agregar funciones para los componentes de la ventana

public class Formulario extends JFrame implements ActionListener{ // agregar ActionListener para los botones
    JButton boton1; // crear un boton
    public Formulario(){
        setLayout(null); // agregar un layout nulo para poder ubicar los componentes
        boton1 = new JButton("cerrar"); 
        boton1.setBounds(300,250,100,30); // (x,y,width,height)
        add(boton1); // agregar el boton al frame
        boton1.addActionListener(this); // agregar el ActionListener para el boton
    }

    public void actionPerformed(ActionEvent e){ 
        if(e.getSource()==boton1){ 
            System.exit(0); 
        }
    }
    public static void main(String[] args){
        Formulario Formulario = new Formulario(); // crear un objeto de la clase Formulario
        Formulario.setBounds(0,0,450,350); // (x,y,width,height) 
        Formulario.setVisible(true); // hacer visible el frame
        Formulario.setResizable(false); // no permitir cambiar el tamaño de la ventana
        Formulario.setLocationRelativeTo(null); // centrar la ventana en la pantalla
    }
}



