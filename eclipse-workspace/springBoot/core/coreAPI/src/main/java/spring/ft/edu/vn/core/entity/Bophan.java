package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="bophan")
public class Bophan implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="MaBP")
    private String maBP;

    public String getMaBP() {
        return this.maBP;
    }

    public String getMaBP(String maBP) {
        return this.maBP = maBP;
    }
    
    @Column(name="Macha")
    private String macha;

    public String getMacha() {
        return this.macha;
    }

    public String getMacha(String macha) {
        return this.macha = macha;
    }
    
    @Column(name="TenBP")
    private String tenBP;

    public String getTenBP() {
        return this.tenBP;
    }

    public String getTenBP(String tenBP) {
        return this.tenBP = tenBP;
    }


}
