package classes;

/**
 *
 * @author LLira
 */
public class ColaPrioridades {

    private ColaP cola1;
    private ColaP cola2;
    private ColaP cola3;

    public ColaPrioridades(int tam) {
        cola1 = new ColaP(tam, 1);
        cola2 = new ColaP(tam, 2);
        cola3 = new ColaP(tam, 3);
    }

    public void insertar(String tarea, int p) {
        switch (p) {
            case 1:
                cola1.insertar(tarea);
                break;
            case 2:
                cola2.insertar(tarea);
                break;
            case 3:
                cola3.insertar(tarea);
        }
    }

    public String eliminar() {
        String salida = null;
        if (!cola1.isEmpty()) {
            salida = cola1.eliminar();
        } else if (!cola2.isEmpty()) {
            salida = cola2.eliminar();
        } else {
            salida = cola3.eliminar();
        }
        return salida;
    }

    public ColaP getCola1() {
        return cola1;
    }

    public ColaP getCola2() {
        return cola2;
    }

    public ColaP getCola3() {
        return cola3;
    }

}//End
