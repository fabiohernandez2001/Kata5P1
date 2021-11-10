/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Crear_Tabla {
    public static void createNewTable() {
        String url = "jdbc:sqlite:kata5.db";
        String sql = "CREATE TABLE IF NOT EXISTS EMAIL (\n"
        + " Id integer PRIMARY KEY AUTOINCREMENT,\n"
        + " Mail text NOT NULL);";
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla creada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
