
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        //Calendar calendario = new GregorianCalendar();
        
        int hora, minutos, segundos;
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        
      
         JOptionPane.showMessageDialog(null,"LA HORA ACTUAL ES: "+hora + ":" + minutos + ":" + segundos);
    }
}
