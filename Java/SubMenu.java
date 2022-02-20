import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SubMenu extends JFrame implements ActionListener{
    private JMenuBar barraMenu;
    private JMenu menuOpciones, tamanio, color;
    private JMenuItem tamanio_1, tamanio_2, color_1, color_2,salir;


    public SubMenu(){
        setLayout(null);
        barraMenu = new JMenuBar(); 
        setJMenuBar(barraMenu); 
        menuOpciones = new JMenu("Opciones"); 
        tamanio = new JMenu("Tamaño"); 
        color = new JMenu("Color"); 
        salir = new JMenuItem("Salir");
        tamanio_1 = new JMenuItem("300*200");
        tamanio_2 = new JMenuItem("640*480"); 
        color_1 = new JMenuItem("Rojo");     
        color_2 = new JMenuItem("Verde"); 
        menuOpciones.add(tamanio); 
        menuOpciones.add(color); 
        menuOpciones.add(salir); 
        barraMenu.add(menuOpciones); 
        tamanio.add(tamanio_1); 
        tamanio.add(tamanio_2); 
        color.add(color_1); 
        color.add(color_2); 
        tamanio_1.addActionListener(this); 
        tamanio_2.addActionListener(this); 
        color_1.addActionListener(this); 
        color_2.addActionListener(this); 
        salir.addActionListener(this); 
    }
    
    public void actionPerformed(ActionEvent e){
        Container contenedor= this.getContentPane(); 
        if(e.getSource() == tamanio_1){
            setSize(300,200);
        }
        if(e.getSource() == tamanio_2){
            setSize(640,480);
        }
        if(e.getSource() == color_1){
            contenedor.setBackground(Color.red);
        }
        if(e.getSource() == color_2){
            contenedor.setBackground(Color.green);
        }
        if(e.getSource() == salir){
            System.exit(0);
        }
    }


    public static void main(String args[]){
        SubMenu subMenu = new SubMenu();
        subMenu.setVisible(true);
        subMenu.setSize(300,300);
        subMenu.setResizable(false);
        subMenu.setLocationRelativeTo(null);
    }
}

