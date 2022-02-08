import javax.swing.JFrame;


public class Formulario2 extends JFrame{ // JFrame es una clase de la 
                                         //libreria de Swing que nos permite crear una ventana
    public Formulario2(){
        setLayout(null); // setLayout(null) es una funcion de la libreria de Swing que nos permite 
                         // definir el layout de nuestra ventana 
    }
    public static void main(String[] args){
        Formulario2 formulario2 = new Formulario2(); // Creamos un objeto de la clase Formulario2
        formulario2.setBounds(0,0,500,500); // (x,y,width,height)
        formulario2.setVisible(true); // setVisible(true) hace visible la ventana    
        formulario2.setLocationRelativeTo(null); // centra la ventana en la pantalla
        formulario2.setResizable(false); // no permite cambiar el tamaño de la ventana
    }

}

