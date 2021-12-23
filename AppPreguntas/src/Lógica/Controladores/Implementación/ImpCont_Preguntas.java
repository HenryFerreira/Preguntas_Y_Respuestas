package Lógica.Controladores.Implementación;

import Lógica.Controladores.Interfaces.Cont_Preguntas;

/**
 *
 * @author Haff
 */
public class ImpCont_Preguntas implements Cont_Preguntas {

    public ImpCont_Preguntas() {
    }
    
    private static ImpCont_Preguntas instance;

    //Obtener instancia de la IMP_PREGUNTAS
    public ImpCont_Preguntas getInstance() {
        if (null == instance) {
            instance = new ImpCont_Preguntas();
        }
        return instance;
    }
    
}
