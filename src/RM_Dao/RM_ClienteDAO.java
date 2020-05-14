
package RM_Dao;

import RM_Bean.RM_Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_ClienteDAO {
    
    
    public static void adicionar(RM_Clientes clientes) {

        String sql = "INSERT INTO Clientes (Nome, CPF, Telefone, Rua, Bairro) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientes.getRM_Nome());
            stmt.setInt(2, clientes.getRM_CPF());
            stmt.setInt(3, clientes.getRm_Telefone());
            stmt.setString(4, clientes.getRM_Rua());
            stmt.setString(5, clientes.getRM_Bairro());
            stmt.execute();
        } catch (Exception e) {

        }
    }
    
    public static ArrayList<RM_Clientes> listar() {

        ArrayList<RM_Clientes> Clientes = new ArrayList<>();

        String sql = "SELECT * FROM clientes";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while (dados.next()) {
                RM_Clientes temporario = new RM_Clientes();
                temporario.setRM_Nome(dados.getString("Nome"));
                temporario.setRM_CPF(dados.getInt("CPF"));
                temporario.setRm_Telefone(dados.getInt("Telefone"));
                temporario.setRM_Rua(dados.getString("Rua"));
                temporario.setRM_Bairro(dados.getString("Bairro"));

                Clientes.add(temporario);
            }

        } catch (Exception e) {
        }

        return Clientes;
    }

    public static void excluir() {
    }

    public static void atualizar() {
    }

}
