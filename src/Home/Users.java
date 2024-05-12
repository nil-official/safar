/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author nilad
 */
@Entity
@Table(name = "USERS", catalog = "", schema = "TECHNO")
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByUname", query = "SELECT u FROM Users u WHERE u.uname = :uname")
    , @NamedQuery(name = "Users.findByUemail", query = "SELECT u FROM Users u WHERE u.uemail = :uemail")
    , @NamedQuery(name = "Users.findByUdob", query = "SELECT u FROM Users u WHERE u.udob = :udob")
    , @NamedQuery(name = "Users.findByUph", query = "SELECT u FROM Users u WHERE u.uph = :uph")
    , @NamedQuery(name = "Users.findByUgender", query = "SELECT u FROM Users u WHERE u.ugender = :ugender")
    , @NamedQuery(name = "Users.findByUcountry", query = "SELECT u FROM Users u WHERE u.ucountry = :ucountry")
    , @NamedQuery(name = "Users.findByUpass", query = "SELECT u FROM Users u WHERE u.upass = :upass")})
public class Users implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "UNAME")
    private String uname;
    @Id
    @Basic(optional = false)
    @Column(name = "UEMAIL")
    private String uemail;
    @Column(name = "UDOB")
    @Temporal(TemporalType.DATE)
    private Date udob;
    @Column(name = "UPH")
    private Long uph;
    @Column(name = "UGENDER")
    private Character ugender;
    @Column(name = "UCOUNTRY")
    private String ucountry;
    @Column(name = "UPASS")
    private String upass;

    public Users() {
    }

    public Users(String uemail) {
        this.uemail = uemail;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        String oldUname = this.uname;
        this.uname = uname;
        changeSupport.firePropertyChange("uname", oldUname, uname);
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        String oldUemail = this.uemail;
        this.uemail = uemail;
        changeSupport.firePropertyChange("uemail", oldUemail, uemail);
    }

    public Date getUdob() {
        return udob;
    }

    public void setUdob(Date udob) {
        Date oldUdob = this.udob;
        this.udob = udob;
        changeSupport.firePropertyChange("udob", oldUdob, udob);
    }

    public Long getUph() {
        return uph;
    }

    public void setUph(Long uph) {
        Long oldUph = this.uph;
        this.uph = uph;
        changeSupport.firePropertyChange("uph", oldUph, uph);
    }

    public Character getUgender() {
        return ugender;
    }

    public void setUgender(Character ugender) {
        Character oldUgender = this.ugender;
        this.ugender = ugender;
        changeSupport.firePropertyChange("ugender", oldUgender, ugender);
    }

    public String getUcountry() {
        return ucountry;
    }

    public void setUcountry(String ucountry) {
        String oldUcountry = this.ucountry;
        this.ucountry = ucountry;
        changeSupport.firePropertyChange("ucountry", oldUcountry, ucountry);
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        String oldUpass = this.upass;
        this.upass = upass;
        changeSupport.firePropertyChange("upass", oldUpass, upass);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uemail != null ? uemail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.uemail == null && other.uemail != null) || (this.uemail != null && !this.uemail.equals(other.uemail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Home.Users[ uemail=" + uemail + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
