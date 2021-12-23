package Lógica.Controladores.Implementación;

import Lógica.Controladores.Interfaces.Usuarios;

/**
 *
 * @author Haff
 */
public class Imp_Usuario implements Usuarios{

    public Imp_Usuario() {
    }
    
    private static Imp_Usuario instance;

    //Obtener instancia de la IMP_USUARIO
    public Imp_Usuario getInstance() {
        if (null == instance) {
            instance = new Imp_Usuario();
        }
        return instance;
    }
}
