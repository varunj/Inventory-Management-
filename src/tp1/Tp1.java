/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author Varun Jain
 */
public class Tp1 {

    static String usr,pass;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new A_IntroForm().setVisible(true);
            }
        });   // TODO code application logic here
    }
}
