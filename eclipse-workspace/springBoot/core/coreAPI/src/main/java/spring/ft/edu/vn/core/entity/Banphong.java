package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="banphong")
public class Banphong implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="Soban")
    private String soban;

    public String getSoban() {
        return this.soban;
    }

    public String getSoban(String soban) {
        return this.soban = soban;
    }
    
    @Column(name="MaKV")
    private String maKV;

    public String getMaKV() {
        return this.maKV;
    }

    public String getMaKV(String maKV) {
        return this.maKV = maKV;
    }
    
    @Column(name="MaBG")
    private String maBG;

    public String getMaBG() {
        return this.maBG;
    }

    public String getMaBG(String maBG) {
        return this.maBG = maBG;
    }


}
