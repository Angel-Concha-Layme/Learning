//Como pasar texto de un JTextField a un JTextArea
import javax.swing.*;
import java.awt.event.*;


public class Formulario4 extends JFrame implements ActionListener{
    private JButton boton_agregar, boton_salir;
    private JTextField field_nombre;
    private JTextArea area_texto;
    private JScrollPane scroll;
    
    public Formulario4(){
        setLayout(null);
        boton_agregar = new JButton("Agregar");
        boton_agregar.setBounds(250,10,100,30); // (x,y,width,height)
        add(boton_agregar);
        boton_agregar.addActionListener(this);


        field_nombre = new JTextField();
        field_nombre.setBounds(10,10,200,30);
        add(field_nombre);

        area_texto = new JTextArea();
        scroll = new JScrollPane(area_texto);
        scroll.setBounds(10,50,400,300); // (x,y,width,height)  
        add(scroll);

        boton_salir = new JButton("Salir");
        boton_salir.setBounds(415,300,100,30);
        add(boton_salir);
        boton_salir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton_agregar){
            String nombre = field_nombre.getText();
            area_texto.append(nombre+"\n");
            field_nombre.setText("");
        }
        if(e.getSource()==boton_salir){
            System.exit(0);
        }
    }


    public static void main(String args[]){
        Formulario4 Formulario;
        Formulario = new Formulario4();
        Formulario.setBounds(0,0,540,400);
        Formulario.setVisible(true);
        Formulario.setResizable(false);
        Formulario.setLocationRelativeTo(null);
    }
}