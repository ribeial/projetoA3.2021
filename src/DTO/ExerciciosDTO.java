package DTO;

import java.util.List;

/**
 *
 * @author victo
 */
public class ExerciciosDTO {

    private String nomeExercicios, serieExercicios, repetição_exercicio;

    public ExerciciosDTO() {
    }

    public ExerciciosDTO(String nomeExercicios, String serieExercicios, String repetição_exercicio, UsuarioDTO usuarioDTO) {
        this.nomeExercicios = nomeExercicios;
        this.serieExercicios = serieExercicios;
        this.repetição_exercicio = repetição_exercicio;
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

    public String getRepetição_exercicio() {
        return repetição_exercicio;
    }

    public void setRepetição_exercicio(String repetição_exercicio) {
        this.repetição_exercicio = repetição_exercicio;
    }

    public void add(List<ExerciciosDTO> exercicios) {
    }
}
