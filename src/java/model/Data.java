package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private final Conexion C;

    public Data() throws SQLException {
        C = new Conexion(
                DatosConexion.SERVER,
                DatosConexion.BD,
                DatosConexion.USER,
                DatosConexion.PASS);
    }

    public void RegistrarUsuario(Persona p) throws SQLException {
        String query = "INSERT INTO persona VALUES (null,'" + p.getNombre() + "'"
                + ",'" + p.getEdad() + "'"
                + ",'" + p.getCorreo() + "')";

        C.ejecutar(query);
    }

    public List<Persona> listarPersona(String buscar) throws SQLException {

        List<Persona> lista = new ArrayList<>();
        Persona p = null;

        String query = "SELECT * FROM persona WHERE nombre LIKE '%"+buscar+"%'";

        C.resultado = C.ejecutarSelect(query);

        while (C.resultado.next()) {

            p = new Persona();
            p.setId(C.resultado.getInt(1));
            p.setNombre(C.resultado.getString(2));
            p.setEdad(C.resultado.getInt(3));
            p.setCorreo(C.resultado.getString(4));

            lista.add(p);
        }

        return lista;

    }

    public List<Persona> listarPorId(String id) throws SQLException {
        List<Persona> lista = new ArrayList<>();
        Persona p = null;
        String query = "SELECT * from PERSONA where ID = '" + id + "'";

        C.resultado = C.ejecutarSelect(query);

        while (C.resultado.next()) {
            p = new Persona();

            p.setId(C.resultado.getInt(1));
            p.setNombre(C.resultado.getString(2));
            p.setEdad(C.resultado.getInt(3));
            p.setCorreo(C.resultado.getString(4));

            lista.add(p);
        }
        return lista;
    }
    
    public Persona getPersona (String id) throws SQLException{
       
        Persona p = new Persona();
        
        String query= "SELECT * FROM persona WHERE id ="+id;
        
        C.resultado = C.ejecutarSelect(query);
        
        
        if (C.resultado.next()) {
            p = new Persona();

            p.setId(C.resultado.getInt(1));
            p.setNombre(C.resultado.getString(2));
            p.setEdad(C.resultado.getInt(3));
            p.setCorreo(C.resultado.getString(4));

            
        }
        
    return p;
    
    
    }

    public List<Persona> listartodoo() throws SQLException {
        List<Persona> listap = new ArrayList<>();
        Persona p = null;
        String query = "SELECT * FROM persona";

        C.resultado = C.ejecutarSelect(query);

        while (C.resultado.next()) {

            p = new Persona();

            p.setId(C.resultado.getInt(1));
            p.setNombre(C.resultado.getString(2));
            p.setEdad(C.resultado.getInt(3));
            p.setCorreo(C.resultado.getString(4));

            listap.add(p);

        }
        return listap;

    }

}
