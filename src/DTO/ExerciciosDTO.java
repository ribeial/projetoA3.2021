package DTO;

import java.util.List;

/**
 *
 * @author victo
 */
public class ExerciciosDTO {

    private String nomeExercicios, serieExercicios, repeticao_exercicio;

    public ExerciciosDTO() {
    }

    public ExerciciosDTO(String nomeExercicios, String serieExercicios, String repeticao_exercicio, UsuarioDTO usuarioDTO) {
        this.nomeExercicios = nomeExercicios;
        this.serieExercicios = serieExercicios;
        this.repeticao_exercicio = repeticao_exercicio;
    }

    public String getNomeExercicios() {
        return nomeExercicios;
    }

    public void setNomeExercicioso(String nomeExercicios) {
        this.nomeExercicios = nomeExercicios;
    }

    public String getSerieExercicios() {
        return serieExercicios;
    }

    public void setSerieExercicios(String serieExercicios) {
        this.serieExercicios = serieExercicios;
    }

    public String getRepeticao_exercicio() {
        return repeticao_exercicio;
    }

    public void setRepetição_exercicio(String repeticao_exercicio) {
        this.repeticao_exercicio = repeticao_exercicio;
    }

    public void add(List<ExerciciosDTO> exercicios) {
    }
}
