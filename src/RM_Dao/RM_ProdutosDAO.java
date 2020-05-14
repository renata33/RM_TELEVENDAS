
package RM_Dao;

import RM_Bean.RM_Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_ProdutosDAO {
    
    
    public static void adicionar(RM_Produtos Produtos) {

        String sql = "INSERT INTO RM_Fornecedor (Descricao, Valor, Quantidade, ID, Lote) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Produtos.getRM_Descricao());
            stmt.setDouble(2, Produtos.getRM_valor());
            stmt.setInt(3, Produtos.getRM_quantidade());
            stmt.setInt(4, Produtos.getRM_ID());
            stmt.setString(5, Produtos.getRM_Lote());
            stmt.execute();
        } catch (Exception e) {

        }
    }
    
    public static ArrayList<RM_Produtos> listar() {

        ArrayList<RM_Produtos> Produtos = new ArrayList<>();

        String sql = "SELECT * FROM RM_Produtos";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while (dados.next()) {
                RM_Produtos temporario = new RM_Produtos();
                temporario.setRM_Descricao(dados.getString("Descricao"));
                temporario.setRM_valor(dados.getDouble("Valor"));
                temporario.setRM_quantidade(dados.getInt("Quantidade"));
                temporario.setRM_ID(dados.getInt("ID"));
                temporario.setRM_Lote(dados.getString("Lote"));
            
                Produtos.add(temporario);
            }

        } catch (Exception e) {
        }

        return Produtos;
    }

    public static void excluir() {
    }

    public static void atualizar() {
    }

}
