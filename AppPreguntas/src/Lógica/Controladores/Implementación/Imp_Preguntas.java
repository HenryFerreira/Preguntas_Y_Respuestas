package Lógica.Controladores.Implementación;

import Lógica.Controladores.Interfaces.Preguntas;

/**
 *
 * @author Haff
 */
public class Imp_Preguntas implements Preguntas {

    public Imp_Preguntas() {
    }
    
    private static Imp_Preguntas instance;

    //Obtener instancia de la IMP_PREGUNTAS
    public Imp_Preguntas getInstance() {
        if (null == instance) {
            instance = new Imp_Preguntas();
        }
        return instance;
    }
    
}
