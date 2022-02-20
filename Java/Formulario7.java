import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario7 extends JFrame implements ActionListener{
    private JMenuBar barraMenu;
    private JMenu menuColor;
    private JMenuItem rojo, verde, azul, salir;


    public Formulario7(){
        setLayout(null);
        barraMenu = new JMenuBar(); //Crea la barra de menu
        setJMenuBar(barraMenu); //Agrega la barra de menu
        menuColor = new JMenu("Color"); //Crea el menu
        rojo = new JMenuItem("Rojo"); //Crea el item del menu
        verde = new JMenuItem("Verde"); //Crea el item del menu
        azul = new JMenuItem("Azul"); //Crea el item del menu
        salir = new JMenuItem("Salir"); //Crea el item del menu
        menuColor.add(rojo); //Agrega el item al menu
        menuColor.add(verde); //Agrega el item al menu
        menuColor.add(azul); //Agrega el item al menu
        menuColor.add(salir); //Agrega el item al menu
        barraMenu.add(menuColor); //Agrega el menu a la barra de menu
        rojo.addActionListener(this); //Agrega el listener al item
        verde.addActionListener(this); //Agrega el listener al item
        azul.addActionListener(this); //Agrega el listener al item
        salir.addActionListener(this); //Agrega el listener al item
    }

    public void actionPerformed(ActionEvent e){
        Container contenedor= this.getContentPane(); //Obtiene el contenedor del frame principal (this)
        if(e.getSource() == rojo){
            contenedor.setBackground(Color.red);
        }
        if(e.getSource() == verde){
            contenedor.setBackground(Color.green);
        }
        if(e.getSource() == azul){
            contenedor.setBackground(Color.blue);
        }
        if(e.getSource() == salir){
            System.exit(0);
        }
    }
    

    public static void main(String args[]){
        Formulario7 formulario7 = new Formulario7();
        formulario7.setVisible(true);
        formulario7.setSize(300,300);
        formulario7.setResizable(false);
        formulario7.setLocationRelativeTo(null); //Centrar ventana

    }
}