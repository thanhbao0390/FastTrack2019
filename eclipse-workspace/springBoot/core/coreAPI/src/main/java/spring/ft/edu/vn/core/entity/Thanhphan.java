package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="thanhphan")
public class Thanhphan implements Serializable {
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
    private Integer maSP;

    public Integer getMaSP() {
        return this.maSP;
    }

    public Integer getMaSP(Integer maSP) {
        return this.maSP = maSP;
    }
    
    @Column(name="MaDVT")
    private Integer maDVT;

    public Integer getMaDVT() {
        return this.maDVT;
    }

    public Integer getMaDVT(Integer maDVT) {
        return this.maDVT = maDVT;
    }
    
    @Column(name="MaTP")
    private Integer maTP;

    public Integer getMaTP() {
        return this.maTP;
    }

    public Integer getMaTP(Integer maTP) {
        return this.maTP = maTP;
    }
    
    @Column(name="MaDVTTP")
    private Integer maDVTTP;

    public Integer getMaDVTTP() {
        return this.maDVTTP;
    }

    public Integer getMaDVTTP(Integer maDVTTP) {
        return this.maDVTTP = maDVTTP;
    }
    
    @Column(name="Soluong")
    private Integer soluong;

    public Integer getSoluong() {
        return this.soluong;
    }

    public Integer getSoluong(Integer soluong) {
        return this.soluong = soluong;
    }


}
