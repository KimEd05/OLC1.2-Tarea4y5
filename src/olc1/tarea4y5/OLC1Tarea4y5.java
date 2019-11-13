/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc1.tarea4y5;

import java.awt.Font;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import javax.swing.UIManager;

/**
 *
 * @author KimEd
 */
public class OLC1Tarea4y5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.setProperty("file.encoding","UTF-8");
        Field charset = Charset.class.getDeclaredField("defaultCharset");
        charset.setAccessible(true);
        charset.set(null,null);

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            setFuenteUI(new javax.swing.plaf.FontUIResource("Open Serif Book", Font.PLAIN, 13));
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.show();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public static void setFuenteUI(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration llaves = UIManager.getDefaults().keys();
        while (llaves.hasMoreElements()) {
            Object llave = llaves.nextElement();
            Object valor = UIManager.get(llave);
            if (valor instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(llave, f);
            }
        }
    }
    
}
