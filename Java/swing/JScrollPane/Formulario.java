package JScrollPane;
import javax.swing.*;

public class Formulario extends JFrame{
    private JScrollPane scrollPane1; // JScrollPane es un componente que permite desplazarse por una ventana
    private JTextField  textField1; 
    private JTextArea textArea1; 
    
    public Formulario(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10,10,200,30);
        add(textField1);
        textArea1 = new JTextArea(); // crear un texto
        scrollPane1 = new JScrollPane(textArea1); // crear un scroll (con el texto "Area1")
        scrollPane1.setBounds(10,50,400,300); // (x,y,width,height)
        add(scrollPane1);
    }
    public static void main(String args[]){
        Formulario formulario = new Formulario();
        formulario.setBounds(0,0,540,400);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
