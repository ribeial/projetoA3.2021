package DTO;



/**
 *
 * @author victo
 */
public class UsuarioDTO {

    private String cpf, senha, nome, email, endereco, tipo_sanguineo, sexo, numero_emergencia;

    public String getNumero_emergencia() {
        return numero_emergencia;
    }

    public void setNumero_emergencia(String numero_emergencia) {
        this.numero_emergencia = numero_emergencia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public UsuarioDTO(String cpf, String nome, String endereco, String tipo_sanguineo, String sexo, String numero_emergencia, String email, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.tipo_sanguineo = tipo_sanguineo;
        this.sexo = sexo;
        this.numero_emergencia = numero_emergencia;
        this.email = email;
        this.senha = senha;
    }

    public UsuarioDTO() {
    }
}
