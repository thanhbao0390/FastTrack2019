package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="banggia")
public class Banggia implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="ID")
    private Integer iD;

    public Integer getID() {
        return this.iD;
    }

    public Integer getID(Integer iD) {
        return this.iD = iD;
    }
    
    @Column(name="MaSP")
    private String maSP;

    public String getMaSP() {
        return this.maSP;
    }

    public String getMaSP(String maSP) {
        return this.maSP = maSP;
    }
    
    @Column(name="MaBG")
    private String maBG;

    public String getMaBG() {
        return this.maBG;
    }

    public String getMaBG(String maBG) {
        return this.maBG = maBG;
    }
    
    @Column(name="Dongia")
    private Float  dongia;

    public Float  getDongia() {
        return this.dongia;
    }

    public Float  getDongia(Float  dongia) {
        return this.dongia = dongia;
    }
    
    @Column(name="Giam")
    private Float  giam;

    public Float  getGiam() {
        return this.giam;
    }

    public Float  getGiam(Float  giam) {
        return this.giam = giam;
    }


}
