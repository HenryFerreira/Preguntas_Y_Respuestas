package Lógica.Servicios.Implementación;

import Lógica.Entidades.Usuarios;
import Lógica.Servicios.Interfaces.Serv_Usuarios;
import Persistencia.ConexionBD;
import Persistencia.Consultas_UsuarioBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Haff
 */
public class ServImp_Usuarios implements Serv_Usuarios {

    private static ServImp_Usuarios servicioUsuario;
    private final ConexionBD conexion = new ConexionBD();
    private final Consultas_UsuarioBD consultasUsuarios = new Consultas_UsuarioBD();

    public ServImp_Usuarios() {
    }

    //========================== OBTENER TODOS LOS USUARIOS ==================//
    @Override
    public List<Usuarios> getTodosLosUsuarios() {
        List<Usuarios> usuarios = new ArrayList<>();
        try {

            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasUsuarios.todosLosUsuarios);
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                usuarios.add(usuarioMapper(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServImp_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
    //========================== OBTENER TODOS LOS USUARIOS ==================//

    //============================= MAPPER USUARIO ===========================//
    private Usuarios usuarioMapper(ResultSet rs) throws SQLException {
        try {
            return new Usuarios(rs.getInt("id"), rs.getString("nombre"), rs.getInt("puntos"));
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage(), ex.getCause());
        }
    }
    //============================ MAPPER USUARIO ============================//

}
