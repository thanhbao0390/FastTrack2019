package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="dvtkhac")
public class Dvtkhac implements Serializable {
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
    
    @Column(name="MaDVT")
    private String maDVT;

    public String getMaDVT() {
        return this.maDVT;
    }

    public String getMaDVT(String maDVT) {
        return this.maDVT = maDVT;
    }
    
    @Column(name="Quidoi")
    private Integer quidoi;

    public Integer getQuidoi() {
        return this.quidoi;
    }

    public Integer getQuidoi(Integer quidoi) {
        return this.quidoi = quidoi;
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
