package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="sanpham")
public class Sanpham implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="MaSP")
    private String maSP;

    public String getMaSP() {
        return this.maSP;
    }

    public String getMaSP(String maSP) {
        return this.maSP = maSP;
    }
    
    @Column(name="Manhom")
    private String manhom;

    public String getManhom() {
        return this.manhom;
    }

    public String getManhom(String manhom) {
        return this.manhom = manhom;
    }
    
    @Column(name="TenSP")
    private String tenSP;

    public String getTenSP() {
        return this.tenSP;
    }

    public String getTenSP(String tenSP) {
        return this.tenSP = tenSP;
    }
    
    @Column(name="MaDVT")
    private String maDVT;

    public String getMaDVT() {
        return this.maDVT;
    }

    public String getMaDVT(String maDVT) {
        return this.maDVT = maDVT;
    }
    
    @Column(name="SLDK")
    private Float  sLDK;

    public Float  getSLDK() {
        return this.sLDK;
    }

    public Float  getSLDK(Float  sLDK) {
        return this.sLDK = sLDK;
    }
    
    @Column(name="GTDK")
    private Float  gTDK;

    public Float  getGTDK() {
        return this.gTDK;
    }

    public Float  getGTDK(Float  gTDK) {
        return this.gTDK = gTDK;
    }
    
    @Column(name="IsMenu")
    private Integer isMenu;

    public Integer getIsMenu() {
        return this.isMenu;
    }

    public Integer getIsMenu(Integer isMenu) {
        return this.isMenu = isMenu;
    }


}
