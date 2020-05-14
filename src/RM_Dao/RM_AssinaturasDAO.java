
package RM_Dao;

import RM_Bean.RM_Assinaturas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_AssinaturasDAO {
    
    
    public static void adicionar(RM_Assinaturas Assinaturas) {

        String sql = "INSERT INTO RM_Assinaturas (Servico, Duracao, Assinaturas, Bonus, Assistencia) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Assinaturas.getRM_Servico());
            stmt.setInt(2, Assinaturas.getRM_Duracao());
            stmt.setString(3, Assinaturas.getRM_Tipo_de_Assinatura());
            stmt.setString(4, Assinaturas.getRM_Bonus());
            stmt.setString(5, Assinaturas.getRM_Assistencia());
            stmt.execute();
        } catch (Exception e) {

        }
    }
    
    public static ArrayList<RM_Assinaturas> listar() {

        ArrayList<RM_Assinaturas> Assinaturas = new ArrayList<>();

        String sql = "SELECT * FROM RM_Assinaturas";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while (dados.next()) {
                RM_Assinaturas temporario = new RM_Assinaturas();
                temporario.setRM_Servico(dados.getString("Servico"));
                temporario.setRM_Duracao(dados.getInt("Duracao"));
                temporario.setRM_Tipo_de_Assinatura(dados.getString("Tipo de Assinatura"));
                temporario.setRM_Bonus(dados.getString("Bonus"));
                temporario.setRM_Assistencia(dados.getString("Assistencia"));

                Assinaturas.add(temporario);
            }

        } catch (Exception e) {
        }

        return Assinaturas;
    }

    public static void excluir() {
    }

    public static void atualizar() {
    }

}
