import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formulario3 extends JFrame {
    private JLabel label1;
    private JLabel label2;
    
    public Formulario3(){
        setLayout(null); 
        label1 = new JLabel("Hola Mundo");
        label1.setBounds(10,20,300,30);
        add(label1); // add(label1) agrega el label1 al formulario
        label2 = new JLabel("Hola Mundo 2");
        label2.setBounds(10,100,100,30);
        add(label2); // add(label2) agrega el label2 al formulario
    }
 
    public static void main(String[] args) {
        Formulario3 formulario3 = new Formulario3();
        formulario3.setBounds(0,0,300,200); // (x,y,width,height)
        formulario3.setVisible(true);    
        formulario3.setLocationRelativeTo(null); // centra la ventana en la pantalla
    }
}
