
package RM_Dao;

import RM_Bean.RM_Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_FuncionariosDAO {
    
    
    public static void adicionar(RM_Funcionarios Funcionarios) {

        String sql = "INSERT INTO RM_Fornecedor (Nome, CPF, Experiencia, Salario, Nide de acesso ) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Funcionarios.getRM_Nome());
            stmt.setString(2, Funcionarios.getRM_CPF());
            stmt.setString(3, Funcionarios.getRM_Experiencia());
            stmt.setDouble(4, Funcionarios.getRM_Salario());
            stmt.setString(5, Funcionarios.getRM_Nivel_de_Acesso());
            stmt.execute();
        } catch (Exception e) {

        }
    }
    
    public static ArrayList<RM_Funcionarios> listar() {

        ArrayList<RM_Funcionarios> Funcionarios = new ArrayList<>();

        String sql = "SELECT * FROM RM_Funcionarios";

        try {
            Connection conexao = RM_ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while (dados.next()) {
                RM_Funcionarios temporario = new RM_Funcionarios();
                temporario.setRM_Nome(dados.getString("Nome"));
                temporario.setRM_CPF(dados.getString("CPF"));
                temporario.setRM_Experiencia(dados.getString("Experiencia"));
                temporario.setRM_Salario(dados.getDouble("Salario"));
                temporario.setRM_Nivel_de_Acesso(dados.getString("Nivel de Acesso"));
            
                Funcionarios.add(temporario);
            }

        } catch (Exception e) {
        }

        return Funcionarios;
    }

    public static void excluir() {
    }

    public static void atualizar() {
    }

}
