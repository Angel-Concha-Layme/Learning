package JComboBox;
import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ItemListener{ // implements ActionListener
    private JComboBox combo1; // combo1 = new JComboBox();

    public Formulario(){
        setLayout(null);
        combo1 = new JComboBox(); // crea un JComboBox
        combo1.setBounds(10,10,80,20); 
        add(combo1);
        combo1.addItem("Item 1");
        combo1.addItem("Item 2");
        combo1.addItem("Item 3");
        combo1.addItem("Item 4");
        combo1.addItem("Item 5");
        combo1.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == combo1){
            String election;
            election = (String)combo1.getSelectedItem();
            setTitle(election);
        }
    }

    public static void main(String args[]){
        Formulario formulario = new Formulario();
        formulario.setBounds(0,0,300,150);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null); //Centrar ventana
    }
}
