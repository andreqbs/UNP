package ConexaoBD;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author André
 */
public class UsuarioDao {

    private Connection con;

    public void autenticar(String usuario, String senha) {

        // conectando
        con = Conexao.getConexao();

        // cria um preparedStatement
        String sql = "select * from usuario";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("Conectado");
            } else {
                System.out.println("Usuário não cadastrado");
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //executa o comando e guarda os dados em rs

    }

}
