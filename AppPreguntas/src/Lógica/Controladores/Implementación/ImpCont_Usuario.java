package Lógica.Controladores.Implementación;

import Lógica.Controladores.Interfaces.Cont_Usuarios;

/**
 *
 * @author Haff
 */
public class ImpCont_Usuario implements Cont_Usuarios{

    public ImpCont_Usuario() {
    }
    
    private static ImpCont_Usuario instance;

    //Obtener instancia de la IMP_USUARIO
    public ImpCont_Usuario getInstance() {
        if (null == instance) {
            instance = new ImpCont_Usuario();
        }
        return instance;
    }
}
