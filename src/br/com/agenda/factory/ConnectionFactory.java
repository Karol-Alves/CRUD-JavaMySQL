package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    //Username Server
    private static final String USERNAME = "root";
    //Password Server
    private static final String PASSWORD = "";
    //Database path
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";

    //Database Connection
    public static Connection createConnectionToMySQL() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
    }

    public static void  main (String[] args) throws Exception {
        //Recuperar conexão com o banco de dados
        Connection con = createConnectionToMySQL();

        if(con != null) {
            System.out.println("Connection Established");
            con.close();
        }
    }
}

