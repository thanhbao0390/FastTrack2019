package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="nhomhang")
public class Nhomhang implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="Manhom")
    private String manhom;

    public String getManhom() {
        return this.manhom;
    }

    public String getManhom(String manhom) {
        return this.manhom = manhom;
    }
    
    @Column(name="Macha")
    private String macha;

    public String getMacha() {
        return this.macha;
    }

    public String getMacha(String macha) {
        return this.macha = macha;
    }
    
    @Column(name="Tennhom")
    private String tennhom;

    public String getTennhom() {
        return this.tennhom;
    }

    public String getTennhom(String tennhom) {
        return this.tennhom = tennhom;
    }
    
    @Column(name="Loainhom")
    private Integer loainhom;

    public Integer getLoainhom() {
        return this.loainhom;
    }

    public Integer getLoainhom(Integer loainhom) {
        return this.loainhom = loainhom;
    }


}
