package DTO;

import java.util.Date;

/**
 *
 * @author victo
 */
public class CadapioDTo {

    private String receita;
    private Date data;

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public Date getData() {
        return data;
    }

    public Date setData(Date data) {
        this.data = data;
        return null;
    }
}
