import javax.swing.*;
import java.awt.event.*;


public class Formulario5 extends JFrame implements ActionListener{
    private JTextField textfield1, textfield2;
    private JLabel label1,label2,label3;
    private JButton boton1;
     
    public Formulario5(){
        setLayout(null);
        label1 = new JLabel("Valor 1 :");
        label1.setBounds(10,10,100,20);
        add(label1);
        
        label2 = new JLabel("Valor 2 :");
        label2.setBounds(10,40,100,20);
        add(label2);

        label3 = new JLabel("Resultado :");
        label3.setBounds(10,70,100,20);
        add(label3);

        textfield1 = new JTextField();
        textfield1.setBounds(120,10,100,20);
        add(textfield1);

        textfield2 = new JTextField();
        textfield2.setBounds(120,40,100,20);
        add(textfield2);

        boton1 = new JButton("Calcular");
        boton1.setBounds(120,70,100,20);
        boton1.addActionListener(this);
        add(boton1);
    }

    public void actionPerformed(ActionEvent e){
        String valor1 = textfield1.getText();
        String valor2 = textfield2.getText();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int resultado = num1 + num2;
        label3.setText("Resultado : "+resultado);
    }

    public static void main(String args[]){
        Formulario5 formulario = new Formulario5();
        formulario.setBounds(0,0,300,150);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
