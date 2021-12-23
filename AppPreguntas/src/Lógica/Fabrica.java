package Lógica;

/**
 *
 * @author Haff
 */
public class Fabrica {
    private static Fabrica instancia;
    //Obtener instancia de la FABRICA
    public static Fabrica getInstance() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }
}


