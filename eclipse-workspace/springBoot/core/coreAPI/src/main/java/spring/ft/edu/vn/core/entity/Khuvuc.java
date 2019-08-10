package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="khuvuc")
public class Khuvuc implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="MaKV")
    private String maKV;

    public String getMaKV() {
        return this.maKV;
    }

    public String getMaKV(String maKV) {
        return this.maKV = maKV;
    }
    
    @Column(name="TenKV")
    private String tenKV;

    public String getTenKV() {
        return this.tenKV;
    }

    public String getTenKV(String tenKV) {
        return this.tenKV = tenKV;
    }


}
