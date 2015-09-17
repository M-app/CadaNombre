/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Add {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer =new Scanner(System.in);
      int x,y,res;
      System.out.println("Primer Numero");
      x=leer.nextInt();
      System.out.println("Segundo Numero");
      y=leer.nextInt();
      res=x+y;
      System.out.println("El Resultado es: "+"\n"+res);
    }
}
