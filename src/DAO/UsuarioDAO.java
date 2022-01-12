package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author victo
 */
public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstmt;

    public void create(UsuarioDTO usuarioDTO) {
        try {
            String sql = "insert into usuario (cpf, nome, senha, email, endereco, tipo_sanguineo, sexo, numero_emergencia) values (?,?,?,?,?,?,?,?) ";
            conn = new ConexaoDAO().conectaBD();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, usuarioDTO.getCpf());
            pstmt.setString(2, usuarioDTO.getNome());
            pstmt.setString(3, usuarioDTO.getSenha());
            pstmt.setString(4, usuarioDTO.getEmail());
            pstmt.setString(5, usuarioDTO.getEndereco());
            pstmt.setString(6, usuarioDTO.getTipo_sanguineo());
            pstmt.setString(7, usuarioDTO.getSexo());
            pstmt.setString(8, usuarioDTO.getNumero_emergencia());
            pstmt.executeUpdate();
            pstmt.close();
        }
        catch (SQLException ex) {
            System.out.println(" erro ao inserir informações " + ex);
        }
    }

    public ResultSet autenticaUsuario(UsuarioDTO UsuarioDTO) {
        try {
            conn = new ConexaoDAO().conectaBD();
            String query = "select * from usuario where email=? and senha=?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, UsuarioDTO.getEmail());
            pstmt.setString(2, UsuarioDTO.getSenha());
            ResultSet rs = pstmt.executeQuery();
            return rs;
        }
        catch (SQLException ex) {
            System.out.println("erro na consulta para autenticação " + ex);
            return null;
        }
    }

    public ResultSet loadUser(UsuarioDTO UsuarioDTO) {
        try {
            conn = new ConexaoDAO().conectaBD();
            String query = "select * from usuario where cpf=?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, UsuarioDTO.getCpf());
            ResultSet rs = pstmt.executeQuery();
            return rs;
        }
        catch (SQLException ex) {
            System.out.println("erro na consulta para autenticação " + ex);
            return null;
        }
    }

    public void update(UsuarioDTO usuarioDTO) {
        try {
            conn = new ConexaoDAO().conectaBD();
            String sql = "UPDATE usuario SET   nome=?, senha=?, email=?, endereco=?, tipo_sanguineo=?, sexo=?, numero_emergencia=? where cpf=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, usuarioDTO.getNome());
            pstmt.setString(2, usuarioDTO.getSenha());
            pstmt.setString(3, usuarioDTO.getEmail());
            pstmt.setString(4, usuarioDTO.getEndereco());
            pstmt.setString(5, usuarioDTO.getTipo_sanguineo());
            pstmt.setString(6, usuarioDTO.getSexo());
            pstmt.setString(7, usuarioDTO.getNumero_emergencia());
            pstmt.setString(8, usuarioDTO.getCpf());
            pstmt.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println("atualização erro " + ex);
        }
    }

    public void delete(UsuarioDTO usuarioDTO) {
        try {
            conn = new ConexaoDAO().conectaBD();
            String sql = "delete from usuario where cpf=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, usuarioDTO.getCpf());
            pstmt.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println("não foi possivel deletar " + ex);
        }
    }
}
