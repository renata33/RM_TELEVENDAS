
package RM_Dao;

import RM_Bean.RM_Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_FornecedorDAO {
    
    
    public static void adicionar(RM_Fornecedor Fornecedor) {

        String sql = "INSERT INTO RM_Fornecedor (Denominacao, CNPJ, Telefone, email, Cidade, Bairro) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Fornecedor.getDenominacao());
            stmt.setString(2, Fornecedor.getRM_CNPJ());
            stmt.setInt(3, Fornecedor.getRM_telefone());
            stmt.setString(4, Fornecedor.getRM_email());
            stmt.setString(5, Fornecedor.getRM_Cidade());
            stmt.setString(6, Fornecedor.getRM_Bairro());
            stmt.execute();
        } catch (Exception e) {

        }
    }
    
    public static ArrayList<RM_Fornecedor> listar() {

        ArrayList<RM_Fornecedor> Fornecedor = new ArrayList<>();

        String sql = "SELECT * FROM RM_RM_Fornecedor";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while (dados.next()) {
                RM_Fornecedor temporario = new RM_Fornecedor();
                temporario.setDenominacao(dados.getString("Denominacao"));
                temporario.setRM_CNPJ(dados.getString("CNPJ"));
                temporario.setRM_telefone(dados.getInt("Telefone"));
                temporario.setRM_email(dados.getString("E-mail"));
                temporario.setRM_Cidade(dados.getString("Cidade"));
                temporario.setRM_Bairro(dados.getString("Bairro"));

                Fornecedor.add(temporario);
            }

        } catch (Exception e) {
        }

        return Fornecedor;
    }

    public static void excluir() {
    }

    public static void atualizar() {
    }

}
