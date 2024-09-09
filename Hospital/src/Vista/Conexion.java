/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection conn;

    public static Connection getConexion() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcitas", "root", "Sasky123");
        } catch (SQLException e) {
            System.out.println(e.toString());
            conn = null;
        }
        return conn;
    }

}
