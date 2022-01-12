package DTO;

import java.util.Date;

/**
 *
 * @author victo
 */
public class RegistroPesoDTO {

    private int peso;
    private Date data;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Date getData() {
        return data;
    }

    public Date setData(Date data) {
        this.data = data;
        return null;
    }
}
