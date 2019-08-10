package spring.ft.edu.vn.core.entity;

import java.sql.Timestamp;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id")
    private Integer id;

    public Integer getId() {
        return this.id;
    }

    public Integer getId(Integer id) {
        return this.id = id;
    }
    
    @Column(name="email")
    private String email;

    public String getEmail() {
        return this.email;
    }

    public String getEmail(String email) {
        return this.email = email;
    }
    
    @Column(name="name")
    private String name;

    public String getName() {
        return this.name;
    }

    public String getName(String name) {
        return this.name = name;
    }


}
