package JTextField;
import javax.swing.*;
import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener{
    private JTextField texto1; // crear un texto
    private JButton boton1; // crear un boton
    private JLabel label1; // crear un label
    public Formulario(){ 
        setLayout(null); // agregar los componentes a traves de coordenadas
        label1 = new JLabel("Usuario:");
        label1.setBounds(10,10,100,30);
        add(label1);
        texto1 = new JTextField(); 
        texto1.setBounds(100,10,200,30);                        
        add(texto1);
        boton1 = new JButton("aceptar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this); // agregar el ActionListener para el boton
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            String usuario = texto1.getText(); // obtener el texto del texto xd
            setTitle(usuario);
        }
    }

    public static void main(String args[]){
        Formulario Formulario1;
        Formulario1 = new Formulario();
        Formulario1.setBounds(0,0,450,350); // (x,y,width,height)
        Formulario1.setVisible(true); // hacer visible el frame
        Formulario1.setResizable(false); // no permitir cambiar el tamaño de la ventana
        Formulario1.setLocationRelativeTo(null); // centrar la ventana en la pantalla
    }
}