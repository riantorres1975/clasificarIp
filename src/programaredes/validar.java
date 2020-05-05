
package programaredes;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class validar {
    
    public void validarNum(JTextField campo){
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c !='.' && c !=8) {
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Ingresa solo numeros! ");
                }
            }
        });
    }
    
    public void limitarCaracteres(JTextField campo, int cantidad){
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                int tam=campo.getText().length();
                if (tam>=cantidad) {
                    e.consume();
                }
            }
        });
    }
    

    
}
