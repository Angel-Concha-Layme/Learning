package JCheckBox;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

//ChangeListener es una interfaz que permite escuchar los eventos de cambio de estado de un componente

public class Formulario extends JFrame implements ChangeListener{
    private JCheckBox chk1, chk2, chk3;
    
    public Formulario(){
        setLayout(null);
        chk1 = new JCheckBox("Rojo");
        chk2 = new JCheckBox("Verde");
        chk3 = new JCheckBox("Azul");

        chk1.setBounds(10,10,100,20);
        chk2.setBounds(10,40,100,20);
        chk3.setBounds(10,70,100,20);

        add(chk1);
        add(chk2);
        add(chk3);
        chk1.addChangeListener(this);   
        chk2.addChangeListener(this);
        chk3.addChangeListener(this);
    }

    public void stateChanged(ChangeEvent e){
        String tittle="";
        Container contenedor = this.getContentPane();
        if(chk1.isSelected()){
            contenedor.setBackground(Color.red);
            tittle = tittle + "Rojo ";
        }
        if(chk2.isSelected()){
            contenedor.setBackground(Color.green);
            tittle = tittle + "Verde ";
        }
        if(chk3.isSelected()){
            contenedor.setBackground(Color.blue);
            tittle = tittle + "Azul ";
        }
        setTitle(tittle);
    }

    public static void main(String args[]){
        Formulario formulario = new Formulario();
        formulario.setVisible(true);
        formulario.setSize(300,300);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null); //Centrar ventana
    }
}

