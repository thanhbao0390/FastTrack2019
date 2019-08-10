package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="nhanvien")
public class Nhanvien implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="MaNV")
    private String maNV;

    public String getMaNV() {
        return this.maNV;
    }

    public String getMaNV(String maNV) {
        return this.maNV = maNV;
    }
    
    @Column(name="MaBP")
    private String maBP;

    public String getMaBP() {
        return this.maBP;
    }

    public String getMaBP(String maBP) {
        return this.maBP = maBP;
    }
    
    @Column(name="Hoten")
    private String hoten;

    public String getHoten() {
        return this.hoten;
    }

    public String getHoten(String hoten) {
        return this.hoten = hoten;
    }
    
    @Column(name="Diachi")
    private String diachi;

    public String getDiachi() {
        return this.diachi;
    }

    public String getDiachi(String diachi) {
        return this.diachi = diachi;
    }
    
    @Column(name="Dienthoai")
    private String dienthoai;

    public String getDienthoai() {
        return this.dienthoai;
    }

    public String getDienthoai(String dienthoai) {
        return this.dienthoai = dienthoai;
    }
    
    @Column(name="Masothue")
    private String masothue;

    public String getMasothue() {
        return this.masothue;
    }

    public String getMasothue(String masothue) {
        return this.masothue = masothue;
    }
    
    @Column(name="IsKetoan")
    private Integer isKetoan;

    public Integer getIsKetoan() {
        return this.isKetoan;
    }

    public Integer getIsKetoan(Integer isKetoan) {
        return this.isKetoan = isKetoan;
    }
    
    @Column(name="isThungan")
    private Integer isThungan;

    public Integer getIsThungan() {
        return this.isThungan;
    }

    public Integer getIsThungan(Integer isThungan) {
        return this.isThungan = isThungan;
    }


}
