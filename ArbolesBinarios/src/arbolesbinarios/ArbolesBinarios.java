package arbolesbinarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Ashley Quintero
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numero;
        NodoArbol nuevo, n1 = null;
        Arbol raiz = new Arbol();
        raiz.iniciarArbol();
        int opc = 0;
        int opc2 = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de Operaciones con Árboles Binarios "
                    + "\n 1.- Insertar "
                    + "\n 2.- Recorridos "
                    + "\n 3.- Salir"));
            switch (opc) {
                case 1:
                    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "     Dame un numero positivo       "));
                    nuevo = new NodoArbol();
                    nuevo.CreaNodo(numero);
                    n1 = raiz.insertarArbol(nuevo, n1);
                    break;
                case 2:
                    opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de Recorridos "
                            + "\n 1.- Recorrido PreOrden "
                            + "\n 2.- Recorrido InOrden  "
                            + "\n 3.- Recorrido PostOrden "
                            + "\n 4.- Recorrido por Amplitud"
                            + "\n 5.- Salir"));
                    switch (opc2) {

                        case 1:
                            JOptionPane.showConfirmDialog(null, "Recorrido PreOrden");
                            raiz.preOrden(n1);
                            break;
                        case 2:
                            JOptionPane.showConfirmDialog(null, "Recorrido InOrden");
                            raiz.inOrden(n1);
                            break;
                        case 3:
                            JOptionPane.showConfirmDialog(null, "Recorrido PostOrden");
                            raiz.postOrden(n1);
                            break;
                        case 4:
                            JOptionPane.showConfirmDialog(null, "Recorrido por Amplitud");
                            raiz.amplitud(n1);
                            break;
                        case 5:
                            System.exit(0);
                    }
                case 3:
                    System.exit(0);
                    break;
            }
        } while (opc != 4);
    }
}
