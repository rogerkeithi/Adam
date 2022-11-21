import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author roger
 */
public class Projectadam {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) {
           // handle exception
        }
        catch (ClassNotFoundException e) {
           // handle exception
        }
        catch (InstantiationException e) {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }
        
        Tela_inicial telainicial = new Tela_inicial();
        telainicial.setLocationRelativeTo(null);
        telainicial.setVisible(true);
        
        ImageIcon image = new ImageIcon("logo.png");
        
        Image imageres =  image.getImage();
        
        Image newimg = imageres.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        
        image = new ImageIcon(newimg);
        
        telainicial.jLabel1.setIcon(image);
        telainicial.setIconImage(newimg);
    }
}
