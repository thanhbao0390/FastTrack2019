package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="dongct")
public class Dongct implements Serializable {
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
    
    @Column(name="SoCT")
    private String soCT;

    public String getSoCT() {
        return this.soCT;
    }

    public String getSoCT(String soCT) {
        return this.soCT = soCT;
    }
    
    @Column(name="MaSP")
    private String maSP;

    public String getMaSP() {
        return this.maSP;
    }

    public String getMaSP(String maSP) {
        return this.maSP = maSP;
    }
    
    @Column(name="MaDVT")
    private String maDVT;

    public String getMaDVT() {
        return this.maDVT;
    }

    public String getMaDVT(String maDVT) {
        return this.maDVT = maDVT;
    }
    
    @Column(name="Soluong")
    private Float  soluong;

    public Float  getSoluong() {
        return this.soluong;
    }

    public Float  getSoluong(Float  soluong) {
        return this.soluong = soluong;
    }
    
    @Column(name="Dongia")
    private Float  dongia;

    public Float  getDongia() {
        return this.dongia;
    }

    public Float  getDongia(Float  dongia) {
        return this.dongia = dongia;
    }
    
    @Column(name="Giovao")
    private Timestamp giovao;

    public Timestamp getGiovao() {
        return this.giovao;
    }

    public Timestamp getGiovao(Timestamp giovao) {
        return this.giovao = giovao;
    }
    
    @Column(name="Giora")
    private Timestamp giora;

    public Timestamp getGiora() {
        return this.giora;
    }

    public Timestamp getGiora(Timestamp giora) {
        return this.giora = giora;
    }
    
    @Column(name="Tralai")
    private Float  tralai;

    public Float  getTralai() {
        return this.tralai;
    }

    public Float  getTralai(Float  tralai) {
        return this.tralai = tralai;
    }
    
    @Column(name="Giam")
    private Float  giam;

    public Float  getGiam() {
        return this.giam;
    }

    public Float  getGiam(Float  giam) {
        return this.giam = giam;
    }
    
    @Column(name="Ghichu")
    private String ghichu;

    public String getGhichu() {
        return this.ghichu;
    }

    public String getGhichu(String ghichu) {
        return this.ghichu = ghichu;
    }


}
