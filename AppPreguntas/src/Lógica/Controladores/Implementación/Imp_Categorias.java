package Lógica.Controladores.Implementación;

import Lógica.Controladores.Interfaces.Preguntas;

/**
 *
 * @author Haff
 */
public class Imp_Categorias implements Preguntas{
    
    private static Imp_Categorias instance;

    //Obtener instancia de la IMP_CATEGORIAS
    public Imp_Categorias getInstance() {
        if (null == instance) {
            instance = new Imp_Categorias();
        }
        return instance;
    }
    
    
}
