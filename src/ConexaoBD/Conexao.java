package ConexaoBD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

/**
 *
 * @author André
 */
public class Conexao {

    private static Connection connection = null;

    /*
    Conexão com o banco de dados
     */
    public static Connection conectar() {

        try {
            //String driverName = "com.mysql.jdbc.Driver"; // Carregando o JDBC Driver padrão
            String driverName = "net.sourceforge.jtds.jdbc.Driver";

            Class.forName(driverName); // Configurando a nossa conexão com um banco de dados//

            //String servidor = "localhost";    //caminho do servidor do BD
            String servidor = "ANDRE";    //caminho do servidor do BD

            String porta = "1433";

            String bancoDados = "AulaQuinta";        //nome do seu banco de dados

            //String url = "jdbc:mysql://" + servidor + "/" + bancoDados;
            String url = "jdbc:jtds:sqlserver://" + servidor + ":" + porta + "/" + bancoDados + ";instance=SQLEXPRESS"; //Para SQL Server 

            String usuario = "andre";        //nome de um usuário de seu BD      

            String senha = "12345";      //sua senha de acesso

            connection = DriverManager.getConnection(url, usuario, senha);

            return connection;

        } catch (ClassNotFoundException e) {

            System.out.println("O driver não foi encontrado.");

            return null;

        } catch (SQLException e) {

            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;

        }
    }

    public static Connection getConexao() {
        if (connection != null)
            return connection;
        else {
            return conectar();
        }
    }

    public static boolean FecharConexao() {

        try {
            Conexao.getConexao().close();
            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    public static java.sql.Connection ReiniciarConexao() {

        FecharConexao();
        return Conexao.getConexao();
    }
}
