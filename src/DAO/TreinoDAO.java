/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import academia.Aluno;
import academia.Treino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class TreinoDAO {
    private static final Logger LOGGER = Logger.getLogger(FichaDAO.class.getName());

    public static List<Treino> listarTodos() {
    return new TreinoDAO().listar();
}


    public void inserir(Treino treino) {
        try (Connection conn = Conexao.Conectar()) {
            String sql = "INSERT INTO treino (aluno_id, tipo_treino, descricao, duracao_minutos, data_inicio) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, treino.getAlunoId());
            stmt.setString(2, treino.getTipo_treino());
            stmt.setString(3, treino.getDescricao());
            stmt.setInt(4, treino.getDuracao_minutos());
            if (treino.getData_inicio() == null) {
    JOptionPane.showMessageDialog(null, "A data de inicio do treino não foi informada.");
    return; // ou tratar de forma adequada
}
            stmt.setDate(5, new java.sql.Date(treino.getData_inicio().getTimeInMillis()));

            stmt.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao inserir treino", e);
        }
    }
    public List<Treino> listar() {
        List<Treino> lista = new ArrayList<>();
        String sql = "SELECT * FROM treino";

        try (Connection conn = Conexao.Conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Treino treino = new Treino();
                treino.setId(rs.getInt("id"));
                treino.setAlunoId(rs.getInt("aluno_id"));
                treino.setTipo_treino(rs.getString("tipo_treino"));
                treino.setDescricao(rs.getString("descricao"));
                treino.setDuracao_minutos(rs.getInt("duracao_minutos"));
                java.util.Calendar data = java.util.Calendar.getInstance();
                data.setTime(rs.getDate("data_inicio"));
                treino.setData_inicio((GregorianCalendar) data);
                lista.add(treino);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
        public void excluir(int id) {
        String sql = "DELETE FROM treino WHERE id = ?";

        try (Connection conn = Conexao.Conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Treino excluído com sucesso.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir treino: " + e.getMessage());
        }
    }
        public List<Treino> listarPorIdAluno(int idAluno) {
    List<Treino> lista = new ArrayList<>();
    String sql = "SELECT * FROM treino WHERE aluno_id = ?";

    try (Connection conn = Conexao.Conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, idAluno);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Treino treino = new Treino();
            treino.setId(rs.getInt("id"));
            treino.setAlunoId(rs.getInt("aluno_id"));
            treino.setTipo_treino(rs.getString("tipo_treino"));
            treino.setDescricao(rs.getString("descricao"));
            treino.setDuracao_minutos(rs.getInt("duracao_minutos"));
            java.util.Calendar data = java.util.Calendar.getInstance();
            data.setTime(rs.getDate("data_inicio"));
            treino.setData_inicio((GregorianCalendar) data);
            lista.add(treino);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return lista;
}




    
}
