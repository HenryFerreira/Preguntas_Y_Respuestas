package Lógica.Servicios.Implementación;

import Lógica.Servicios.Interfaces.Serv_Usuarios;
import Persistencia.ConexionBD;

/**
 *
 * @author Haff
 */
public class ServImp_Usuarios implements Serv_Usuarios {

    private static ServImp_Usuarios servicioUsuario;
    private final ConexionBD conexion = new ConexionBD();

    public ServImp_Usuarios() {
    }

}
