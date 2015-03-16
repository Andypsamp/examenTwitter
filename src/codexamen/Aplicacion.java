package codexamen;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDY PEÑA SAMPEDRO
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MetodosTwitter twit = new MetodosTwitter();
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("opciones: \n1 --> TimeLine\n2 --> Buscar\n3 --> Tweettear\n4 --> Exit"));
            switch (op) {
                case 1:
                    twit.timeLine();
                    break;
                case 2:
                    twit.buscar();
                    break;
                case 3:
                    twit.tweet();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.exit(0);
            }
        } while (op != 0 && op != 4);
    }
}
