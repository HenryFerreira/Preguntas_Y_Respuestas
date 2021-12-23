package Lógica.Controladores.Implementación;

import Lógica.Controladores.Interfaces.Cont_Categorias;
/**
 *
 * @author Haff
 */
public class ImpCont_Categorias implements Cont_Categorias{
    
    private static ImpCont_Categorias instance;

    //Obtener instancia de la IMP_CATEGORIAS
    public ImpCont_Categorias getInstance() {
        if (null == instance) {
            instance = new ImpCont_Categorias();
        }
        return instance;
    }
    
    
}
