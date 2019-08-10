package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="donvitinh")
public class Donvitinh implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="MaDVT")
    private String maDVT;

    public String getMaDVT() {
        return this.maDVT;
    }

    public String getMaDVT(String maDVT) {
        return this.maDVT = maDVT;
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
