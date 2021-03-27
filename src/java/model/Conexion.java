/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection; // Clase para conectar
import java.sql.Statement; // Clase para enviar consultas SQL
import java.sql.ResultSet; // Clase para obtener los datos o resultados de
                           // un select
import java.sql.SQLException; // Para manejar excepciones de SQL


public class Conexion {

    private Connection conexion; 
    public Statement sentencia;  
    public ResultSet resultado;  

    public Conexion(String server, String bd, String user, String pass) throws SQLException {
        MysqlDataSource mysql = new MysqlDataSource();

        mysql.setServerName(server);
        mysql.setDatabaseName(bd);
        mysql.setUser(user);
        mysql.setPassword(pass);

        conexion = mysql.getConnection();
    }
    
    public void ejecutar(String sql) throws SQLException {
        sentencia = conexion.createStatement();
        sentencia.executeUpdate(sql);
        sentencia.close();
    }

    public ResultSet ejecutarSelect(String select) throws SQLException {
        sentencia = conexion.createStatement();
        resultado = sentencia.executeQuery(select);
        return resultado;
    }
}
