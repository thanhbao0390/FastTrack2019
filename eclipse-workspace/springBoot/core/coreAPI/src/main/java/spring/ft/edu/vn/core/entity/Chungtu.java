package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="chungtu")
public class Chungtu implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="SoCT")
    private String soCT;

    public String getSoCT() {
        return this.soCT;
    }

    public String getSoCT(String soCT) {
        return this.soCT = soCT;
    }
    
    @Column(name="NgayCT")
    private Timestamp ngayCT;

    public Timestamp getNgayCT() {
        return this.ngayCT;
    }

    public Timestamp getNgayCT(Timestamp ngayCT) {
        return this.ngayCT = ngayCT;
    }
    
    @Column(name="Loai")
    private Integer loai;

    public Integer getLoai() {
        return this.loai;
    }

    public Integer getLoai(Integer loai) {
        return this.loai = loai;
    }
    
    @Column(name="Soban")
    private String soban;

    public String getSoban() {
        return this.soban;
    }

    public String getSoban(String soban) {
        return this.soban = soban;
    }
    
    @Column(name="MaKH")
    private String maKH;

    public String getMaKH() {
        return this.maKH;
    }

    public String getMaKH(String maKH) {
        return this.maKH = maKH;
    }
    
    @Column(name="Sokhach")
    private Integer sokhach;

    public Integer getSokhach() {
        return this.sokhach;
    }

    public Integer getSokhach(Integer sokhach) {
        return this.sokhach = sokhach;
    }
    
    @Column(name="Noidung")
    private String noidung;

    public String getNoidung() {
        return this.noidung;
    }

    public String getNoidung(String noidung) {
        return this.noidung = noidung;
    }
    
    @Column(name="MaThungan")
    private String maThungan;

    public String getMaThungan() {
        return this.maThungan;
    }

    public String getMaThungan(String maThungan) {
        return this.maThungan = maThungan;
    }
    
    @Column(name="MaNhanvien")
    private String maNhanvien;

    public String getMaNhanvien() {
        return this.maNhanvien;
    }

    public String getMaNhanvien(String maNhanvien) {
        return this.maNhanvien = maNhanvien;
    }
    
    @Column(name="Giam")
    private Float  giam;

    public Float  getGiam() {
        return this.giam;
    }

    public Float  getGiam(Float  giam) {
        return this.giam = giam;
    }
    
    @Column(name="ThueVAT")
    private Float  thueVAT;

    public Float  getThueVAT() {
        return this.thueVAT;
    }

    public Float  getThueVAT(Float  thueVAT) {
        return this.thueVAT = thueVAT;
    }
    
    @Column(name="PhiPV")
    private Float  phiPV;

    public Float  getPhiPV() {
        return this.phiPV;
    }

    public Float  getPhiPV(Float  phiPV) {
        return this.phiPV = phiPV;
    }
    
    @Column(name="Sotien")
    private Float  sotien;

    public Float  getSotien() {
        return this.sotien;
    }

    public Float  getSotien(Float  sotien) {
        return this.sotien = sotien;
    }
    
    @Column(name="Tratruoc")
    private Float  tratruoc;

    public Float  getTratruoc() {
        return this.tratruoc;
    }

    public Float  getTratruoc(Float  tratruoc) {
        return this.tratruoc = tratruoc;
    }
    
    @Column(name="ConNo")
    private Float  conNo;

    public Float  getConNo() {
        return this.conNo;
    }

    public Float  getConNo(Float  conNo) {
        return this.conNo = conNo;
    }
    
    @Column(name="NgayDat")
    private Timestamp ngayDat;

    public Timestamp getNgayDat() {
        return this.ngayDat;
    }

    public Timestamp getNgayDat(Timestamp ngayDat) {
        return this.ngayDat = ngayDat;
    }
    
    @Column(name="Trangthai")
    private Integer trangthai;

    public Integer getTrangthai() {
        return this.trangthai;
    }

    public Integer getTrangthai(Integer trangthai) {
        return this.trangthai = trangthai;
    }


}
