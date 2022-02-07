package DAO;

import DTO.ExerciciosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class ExerciciosDAO {

    Connection conn;
    PreparedStatement pstmt;

    public void create(ExerciciosDTO exerciciosDTO) {
        try {
            String sql = "insert into exercicios (nome_exercicio, serie_exercicio, repeticao_exercicio) values (?,?,?) ";
            conn = new ConexaoDAO().conectaBD();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, exerciciosDTO.getNomeExercicios());
            pstmt.setString(2, exerciciosDTO.getSerieExercicios());
            pstmt.setString(3, exerciciosDTO.getRepeticao_exercicio());
            pstmt.executeUpdate();
            pstmt.close();
        }
        catch (SQLException ex) {
            System.out.println(" erro em create(ExerciciosDTO exerciciosDTO) " + ex);
        }
    }

    public List<ExerciciosDTO> read() {
        List<ExerciciosDTO> exercicios = new ArrayList<>();
        ResultSet rs = null;
        try {
            conn = new ConexaoDAO().conectaBD();
            pstmt = conn.prepareStatement("select * from exercicios ");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                ExerciciosDTO exer = new ExerciciosDTO();
                exer.setNomeExercicioso(rs.getString("nome_exercicio"));
                exer.setSerieExercicios(rs.getString("serie_exercicio"));
                exer.setRepeticao_exercicio(rs.getString("repeticao_exercicio"));
                exercicios.add(exer);
            }
        }
        catch (SQLException ex) {
            System.out.println("error List<ExerciciosDTO> " + ex);
        }
        return exercicios;
    }

    public void update(ExerciciosDTO exercicios) {
        try {
            conn = new ConexaoDAO().conectaBD();
            String sql = "UPDATE exercicios SET where nome_exercicio,=? serie_exercicio=?, repeticao_exercicio=? ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, exercicios.getNomeExercicios());
            pstmt.setString(2, exercicios.getSerieExercicios());
            pstmt.setString(3, exercicios.getRepeticao_exercicio());
            
            pstmt.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println("erro update(ExerciciosDTO exercicios) " + ex);
        }
    }

    public void delete(ExerciciosDTO exercicios) {
        try {
            conn = new ConexaoDAO().conectaBD();
            String sql = "delete from exercicios where nome_exercicio,=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, exercicios.getNomeExercicios());
            pstmt.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println("erro dele S(ExerciciosDTO exercicios) " + ex);
        }
    }
}
