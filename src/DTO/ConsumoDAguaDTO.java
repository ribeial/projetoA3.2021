package DTO;

import java.util.Date;

/**
 *
 * @author victo
 */
public class ConsumoDAguaDTO {

    private String copos_agua;
    private Date data;

    public String getCopos_agua() {
        return copos_agua;
    }

    public void setCopos_agua(String copos_agua) {
        this.copos_agua = copos_agua;
    }

    public Date getData() {
        return data;
    }

    public Date setData(Date data) {
        this.data = data;
        return null;
    }
}
