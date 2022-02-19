package JTextArea;
import javax.swing.*;

public class Formulario extends JFrame{
    private JTextField textField1;
    private JTextArea textArea1;

    public Formulario(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10,10,200,30);
        add(textField1);
        textArea1 = new JTextArea();
        textArea1.setBounds(10,50,400,300);
        add(textArea1);

    }

    public static void main (String args[]){
        Formulario formulario = new Formulario();
        formulario.setBounds(0,0,450,350);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }

}