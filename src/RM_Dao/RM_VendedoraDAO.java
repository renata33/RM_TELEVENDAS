
package RM_Dao;

import RM_Bean.RM_Vendedora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_VendedoraDAO {
    
    
    public static void adicionar(RM_Vendedora Vendedora) {

        String sql = "INSERT INTO RM_Vendedora (Nome, CPF, N ivel de Acesso, Experiencia, Salario) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Vendedora.getRM_nome());
            stmt.setString(2, Vendedora.getRM_CPF());
            stmt.setInt(3, Vendedora.getRM_nivel_de_acesso());
            stmt.setString(4, Vendedora.getRM_experiencia());
            stmt.setDouble(5, Vendedora.getRM_salario());
            stmt.execute();
        } catch (Exception e) {

        }
    }
    
    public static ArrayList<RM_Vendedora> listar() {

        ArrayList<RM_Vendedora> Vendedora = new ArrayList<>();

        String sql = "SELECT * FROM RM_Vendedora";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while (dados.next()) {
                RM_Vendedora temporario = new RM_Vendedora();
                temporario.setRM_nome(dados.getString("Nome"));
                temporario.setRM_CPF(dados.getString("CPF"));
                temporario.setRM_nivel_de_acesso(dados.getInt("Nivel de Acesso"));
                temporario.setRM_experiencia(dados.getString("Experiencia"));
                temporario.setRM_salario(dados.getInt("Slario"));
                Vendedora.add(temporario);
            }

        } catch (Exception e) {
        }

        return Vendedora;
    }

    public static void excluir() {
    }

    public static void atualizar() {
    }

}
