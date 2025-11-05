package DAO;

import academia.Aluno;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.GregorianCalendar;

public class FichaDAO {
    private static final Logger LOGGER = Logger.getLogger(FichaDAO.class.getName());

    public void inserir(Aluno aluno) {
        try (Connection conn = Conexao.Conectar()) {
            String sql = "INSERT INTO aluno (nome, cpf, data_nascimento, telefone, email, endereco) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            if (aluno.getDataNascimento() == null) {
    JOptionPane.showMessageDialog(null, "A data de nascimento do aluno não foi informada.");
    return; // ou tratar de forma adequada
}
            stmt.setDate(3, new java.sql.Date(aluno.getDataNascimento().getTimeInMillis()));
            stmt.setString(4, aluno.getTelefone());
            stmt.setString(5, aluno.getEmail());
            stmt.setString(6, aluno.getEndereco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao inserir aluno", e);
        }
    }
    public List<Aluno> listarTodos() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM aluno";

        try (Connection conn = Conexao.Conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setCpf(rs.getString("cpf"));

                java.util.Calendar data = java.util.Calendar.getInstance();
                data.setTime(rs.getDate("data_nascimento"));
                aluno.setDataNascimento((GregorianCalendar) data);

                aluno.setTelefone(rs.getString("telefone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setEndereco(rs.getString("endereco"));

                lista.add(aluno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

}
        
