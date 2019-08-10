package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="loaibanggia")
public class Loaibanggia implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="MaBG")
    private String maBG;

    public String getMaBG() {
        return this.maBG;
    }

    public String getMaBG(String maBG) {
        return this.maBG = maBG;
    }
    
    @Column(name="TenBG")
    private String tenBG;

    public String getTenBG() {
        return this.tenBG;
    }

    public String getTenBG(String tenBG) {
        return this.tenBG = tenBG;
    }
    
    @Column(name="Macdinh")
    private Integer macdinh;

    public Integer getMacdinh() {
        return this.macdinh;
    }

    public Integer getMacdinh(Integer macdinh) {
        return this.macdinh = macdinh;
    }


}
