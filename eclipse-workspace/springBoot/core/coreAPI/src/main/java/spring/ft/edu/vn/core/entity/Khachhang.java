package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="khachhang")
public class Khachhang implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="MaKH")
    private String maKH;

    public String getMaKH() {
        return this.maKH;
    }

    public String getMaKH(String maKH) {
        return this.maKH = maKH;
    }
    
    @Column(name="Manhom")
    private String manhom;

    public String getManhom() {
        return this.manhom;
    }

    public String getManhom(String manhom) {
        return this.manhom = manhom;
    }
    
    @Column(name="TenKH")
    private String tenKH;

    public String getTenKH() {
        return this.tenKH;
    }

    public String getTenKH(String tenKH) {
        return this.tenKH = tenKH;
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
    
    @Column(name="ThuDK")
    private Float  thuDK;

    public Float  getThuDK() {
        return this.thuDK;
    }

    public Float  getThuDK(Float  thuDK) {
        return this.thuDK = thuDK;
    }
    
    @Column(name="TraDK")
    private Float  traDK;

    public Float  getTraDK() {
        return this.traDK;
    }

    public Float  getTraDK(Float  traDK) {
        return this.traDK = traDK;
    }


}
